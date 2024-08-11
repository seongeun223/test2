package com.chungchun.website.post.repository;

import com.chungchun.website.post.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface PostRepository extends JpaRepository<Post,Integer> {

    Optional<Post> findByPostNo(int postNo);
}
