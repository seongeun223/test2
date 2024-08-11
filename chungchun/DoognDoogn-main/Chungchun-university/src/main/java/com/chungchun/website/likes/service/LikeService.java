package com.chungchun.website.likes.service;

import com.chungchun.website.likes.model.Like;
import com.chungchun.website.likes.repository.LikeRepository;
import com.chungchun.website.post.model.Post;
import com.chungchun.website.user.model.User;
import com.chungchun.website.user.repository.UserRepository;
import com.chungchun.website.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LikeService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    private final LikeRepository likeRepository;
    private final UserRepository userRepository;


    @Transactional
    public Like addLike(User user, Post post) {
        // 이미 좋아요가 있는지 확인
        Like existingLike = likeRepository.findByUserAndPost(user, post).orElse(null);
        if (existingLike == null) {
            Like like = new Like();
            like.setUser(user);
            like.setPost(post);
            like.setCreateDate(LocalDate.now());
            return likeRepository.save(like);
        }
        return null; // 이미 있는 경우 null 반환
    }

    @Transactional
    public void removeLike(User user, Post post) {
        Like existingLike = likeRepository.findByUserAndPost(user, post).orElse(null);
        if (existingLike != null) {
            existingLike.setDDate(LocalDate.now()); // 삭제일자 설정
            likeRepository.save(existingLike); // 삭제 처리
        }
    }

    public List<Like> getLikesByUser(int userNo) {
        User user = userRepository.findById(userNo).orElse(null); // 사용자 조회 로직
        return likeRepository.findByUser(user); // 사용자에 대한 좋아요 목록 반환
    }
}
