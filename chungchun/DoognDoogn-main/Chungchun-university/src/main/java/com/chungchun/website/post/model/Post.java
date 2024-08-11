package com.chungchun.website.post.model;

import com.chungchun.website.course.model.Course;
import com.chungchun.website.likes.model.Like;
import com.chungchun.website.user.model.User;
import jakarta.persistence.*;
import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cc_post")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_no")
    private int postNo;

    @Column(name = "category_code", nullable = false)
    private String categoryCode;

    @ManyToOne
    @JoinColumn(name = "cls_no")
    private Course clsNo;

    @Column(name = "post_title", nullable = false)
    private String postTitle;

    @Column(name = "post_content")
    private String postContent;

    @Column(name = "post_create_date", nullable = false)
    private Date postCreateDate;

    @ManyToOne
    @JoinColumn(name = "user_no", nullable = false)
    private User userNo;

    @OneToMany(mappedBy = "post")
    private List<Like> likes; // 좋아요 리스트 추가

}
