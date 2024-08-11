package com.chungchun.website.myclass.controller;

import com.chungchun.website.auth.principal.AuthPrincipal;
import com.chungchun.website.myclass.model.MyClass;
import com.chungchun.website.myclass.model.MyClassDTO;
import com.chungchun.website.myclass.service.MyClassService;
import com.chungchun.website.user.model.User;
import com.chungchun.website.user.model.UserDTO;
import com.chungchun.website.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/myClass")
@RequiredArgsConstructor
@Slf4j
public class MyClassController {

    private final MyClassService myClassService;
    private final UserService userService;

    @GetMapping("/myClassList")
    public String myClass(@AuthenticationPrincipal UserDetails userDetails, Model model) {

        log.info("check");

        AuthPrincipal authPrincipal = (AuthPrincipal) userDetails;

        // 1. 유저객체
        User user = authPrincipal.getUser();
        log.info("userId: {} ", user.getUserId());

        // 2. 엔티티에서 찾기
        List<MyClass> myClassList= myClassService.findAllByUser(user);

        log.info("myClassList: {}", myClassList);

        // 3. 
        model.addAttribute("myClassList", myClassList);
        return "myClass/myClassView";
    }
}
