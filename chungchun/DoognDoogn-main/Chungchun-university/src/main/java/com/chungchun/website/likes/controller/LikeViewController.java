package com.chungchun.website.likes.controller;

import com.chungchun.website.likes.model.Like;
import com.chungchun.website.likes.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/likes")
@RequiredArgsConstructor
public class LikeViewController {

    private final LikeService likeService;

    @GetMapping("/my-likes/{userNo}")
    public String getMyLikes(@PathVariable int userNo, Model model) {
        List<Like> likes = likeService.getLikesByUser(userNo);
        model.addAttribute("likes", likes);
        return "like/my-likes"; // Thymeleaf 템플릿 이름
    }
}
