package com.chungchun.website.user.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cc_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no")
    private int userNo;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_pwd")
    private String userPwd;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_phone")
    private String userPhone;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_auth")
    private RoleType role;
}
