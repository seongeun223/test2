package com.chungchun.website.course.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="cc_course")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cls_no", nullable = false)
    private int clsNo;

    @Column(name = "cls_name", nullable = false)
    private String clsName;

    @Column(name = "open_date", nullable = false)
    private LocalDate openDate;

    @Column(name = "close_date", nullable = false)
    private LocalDate closeDate;

    @Column(name = "cls_intro", nullable = false)
    private String clsIntro;

    @Column(name = "cls_prof", nullable = false)
    private String clsProf;





}
