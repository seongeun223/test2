package com.chungchun.website.auth.controller;

import com.chungchun.website.user.model.User;
import com.chungchun.website.user.model.UserDTO;
import com.chungchun.website.user.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login() {
        return "/auth/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String userId, @RequestParam String userPwd, HttpSession session) {
        UserDTO user = userService.findUserById(userId); // ID로 사용자 조회

        // 사용자 존재 여부 확인
        if (user == null) {
            log.error("사용자를 찾을 수 없습니다: {}", userId); // 로그 추가
            return "redirect:/auth/login?error"; // 로그인 실패 시
        }

        // 비밀번호 확인
        if (passwordEncoder.matches(userPwd, user.getPassword())) {
            session.setAttribute("loggedin", true); // 로그인 상태를 세션에 저장
            session.setAttribute("role", user.getRole()); // 사용자 역할 저장

            // 역할에 따라 리디렉션 경로 결정
            if ("ROLE_ADMIN".equals(user.getRole())) {
                log.info("관리자로 로그인했습니다: {}", userId);
                return "redirect:/admin/admin"; // 관리자 페이지로 리다이렉트
            } else {
                log.info("일반 사용자로 로그인했습니다: {}", userId);
                return "redirect:/main"; // 일반 사용자 홈으로 리다이렉트
            }
        } else {
            log.error("비밀번호 불일치: {}", userId); // 로그 추가
            return "redirect:/auth/login?error"; // 비밀번호 불일치 시
        }
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin/admin"; // 관리자 페이지 뷰 이름
    }
}
