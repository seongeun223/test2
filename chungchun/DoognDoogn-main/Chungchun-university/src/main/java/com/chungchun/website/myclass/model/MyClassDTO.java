package com.chungchun.website.myclass.model;

import com.chungchun.website.course.model.Course;
import com.chungchun.website.user.model.User;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MyClassDTO {

    private int mcNo;

    private User user;

    private Course course;

    private int score;

    private int addCount;


}
