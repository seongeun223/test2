package com.chungchun.website.comment.repository;

import com.chungchun.website.comment.model.Comment;
import com.chungchun.website.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {
    List<Comment> findAllByUser(User user);
}
