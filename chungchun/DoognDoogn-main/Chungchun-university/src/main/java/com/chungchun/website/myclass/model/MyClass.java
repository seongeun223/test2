package com.chungchun.website.myclass.model;

import com.chungchun.website.course.model.Course;
import com.chungchun.website.user.model.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="cc_my_class")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
public class MyClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mc_no")
    private int mcNo;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;

    @ManyToOne
    @JoinColumn(name = "cls_no")
    private Course course;

    @Column(name = "score")
    private int score;

    @Column(name = "add_count")
    private int addCount;
}
