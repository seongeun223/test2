package com.chungchun.website.post.model;

import com.chungchun.website.course.model.Course;
import com.chungchun.website.likes.model.Like;
import com.chungchun.website.user.model.User;
import com.chungchun.website.user.model.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PostDTO {

    private int postNo;
    private String categoryCode;
    private Course clsNo;
    private String postTitle;
    private String postContent;
    private Date postCreateDate;
    private User userNo;
    private List<Like> likes;

    // 좋아요 수를 반환하는 메서드
    public int getPostLikes() {
        return likes != null ? likes.size() : 0;
    }

    // Date를 연, 월, 일 형식으로 받아오기
    public String getFormattedPostCreateDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 원하는 형식
        return sdf.format(postCreateDate);
    }
}
