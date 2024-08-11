package com.chungchun.website.likes.controller;

import com.chungchun.website.likes.model.Like;
import com.chungchun.website.likes.service.LikeService;
import com.chungchun.website.post.model.Post;
import com.chungchun.website.user.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/likes")
@RequiredArgsConstructor
@Slf4j
public class LikeController {

    private final LikeService likeService;

    @PostMapping("/add")
    public ResponseEntity<String> addLike(@RequestParam int userNo, @RequestParam int postNo) {
        // 사용자와 게시글을 조회하여 좋아요 추가
        User user = new User(); // 사용자 조회 로직 추가
        Post post = new Post(); // 게시글 조회 로직 추가

        Like like = likeService.addLike(user, post);
        if (like != null) {
            return ResponseEntity.ok("좋아요가 추가되었습니다.");
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body("이미 좋아요가 등록되어 있습니다.");
    }

    @DeleteMapping("/remove")
    public ResponseEntity<String> removeLike(@RequestParam int userNo, @RequestParam int postNo) {
        // 사용자와 게시글을 조회하여 좋아요 삭제
        User user = new User(); // 사용자 조회 로직 추가
        Post post = new Post(); // 게시글 조회 로직 추가

        likeService.removeLike(user, post);
        return ResponseEntity.ok("좋아요가 삭제되었습니다.");
    }

    @GetMapping("/my-likes/{userNo}")
    public ResponseEntity<List<Like>> getMyLikes(@PathVariable int userNo) {
        List<Like> likes = likeService.getLikesByUser(userNo);
        return ResponseEntity.ok(likes);
    }

}
