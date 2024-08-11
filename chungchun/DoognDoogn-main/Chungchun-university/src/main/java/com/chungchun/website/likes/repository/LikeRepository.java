package com.chungchun.website.likes.repository;

import com.chungchun.website.likes.model.Like;
import com.chungchun.website.post.model.Post;
import com.chungchun.website.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LikeRepository extends JpaRepository<Like,Integer> {
    Optional<Like> findByUserAndPost(User user, Post post);

    List<Like> findByUser(User user);
}
