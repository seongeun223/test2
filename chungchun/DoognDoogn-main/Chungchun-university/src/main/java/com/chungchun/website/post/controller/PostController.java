package com.chungchun.website.post.controller;

import com.chungchun.website.auth.principal.AuthPrincipal;
import com.chungchun.website.post.model.Post;
import com.chungchun.website.post.model.PostDTO;
import com.chungchun.website.post.service.PostService;
import com.chungchun.website.user.model.UserDTO;
import com.chungchun.website.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/post")
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostService postService;
    private final UserService userService;

    @GetMapping("/postDetails")
    public String postDetails(Model model){

        List<PostDTO> postList = postService.findAllPosts();

        model.addAttribute("postList",postList);

        return "post/postDetails";
    }

    @GetMapping("/createPost")
    public String createPost(){

        log.info("createPost 이동 get 요청 들어옴...");
        return "post/createPost";
    }

    @PostMapping("/createPost")
    public String createPost(@AuthenticationPrincipal UserDetails userDetails, PostDTO postDTO) {

        log.info("createPost Post 요청 확인!");

        // UserDetails를 AuthPrincipal로 캐스팅
        AuthPrincipal authPrincipal = (AuthPrincipal) userDetails;

        String memberId = authPrincipal.getUsername();
        int userNo = authPrincipal.getUserNo();

        // member 찾기
        UserDTO user = userService.findUserById(memberId);

        log.info("로그인한 사용자 ID : {}", memberId);
        log.info("로그인한 사용자 No : {}", userNo);
        log.info("전달받은 PostDTO : {}", postDTO);

        postService.create(postDTO, user);

        return "redirect:/";
    }

    @GetMapping("/myPost")
    public String myPost(){

        log.info("myPost 이동 get 요청 들어옴...");
        return "post/myPost";
    }


}
