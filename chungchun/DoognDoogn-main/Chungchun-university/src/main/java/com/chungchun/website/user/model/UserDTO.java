package com.chungchun.website.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private Integer userNo;
    private String userId;
    private String userPwd;
    private String userName;
    private String userPhone;
    private String role;

    public String getPassword() {
        return userPwd;
    }
}
