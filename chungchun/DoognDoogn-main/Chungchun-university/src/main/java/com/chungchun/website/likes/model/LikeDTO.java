package com.chungchun.website.likes.model;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LikeDTO {

    private LocalDate c_date;

    private LocalDate d_date;
}
