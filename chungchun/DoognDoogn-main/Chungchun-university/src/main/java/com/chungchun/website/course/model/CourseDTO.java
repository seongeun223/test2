package com.chungchun.website.course.model;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CourseDTO {

    private int cl_no;

    private String cl_name;

    private LocalDate open_date;

    private LocalDate close_date;

    private String cl_intro;

    private String cl_prof;


}
