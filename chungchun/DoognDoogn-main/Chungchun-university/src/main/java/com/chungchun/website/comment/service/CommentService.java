package com.chungchun.website.comment.service;

import com.chungchun.website.comment.model.Comment;
import com.chungchun.website.comment.repository.CommentRepository;
import com.chungchun.website.myclass.model.MyClass;
import com.chungchun.website.user.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional( readOnly = true)
public class CommentService {

    private final CommentRepository commentRepository;

    public List<Comment> findAllByUser(User user) {
            log.info("log 찍기");
            List<Comment> myCommentList = commentRepository.findAllByUser(user);
            log.info("불러왔어용");
            return myCommentList;
        }
    }