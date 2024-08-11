package com.chungchun.website.likes.model;

import com.chungchun.website.post.model.Post;
import com.chungchun.website.user.model.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="cc_like")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Like {

    @Id
    @Column(name = "like_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int likeNo;

    @Column(name = "create_date")
    // 생성일자
    private LocalDate createDate;

    @Column(name = "delete_date")
    private LocalDate dDate;

    @ManyToOne
    @JoinColumn(name = "user_no", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_no", nullable = false)
    private Post post;



}
