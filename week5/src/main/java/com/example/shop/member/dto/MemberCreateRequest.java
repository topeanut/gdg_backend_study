package com.example.shop.member.dto;

//id, loginid, password, phonenum, address

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberCreateRequest {
    private String loginId;
    private String password;
    private String phoneNumber;
    private String address;
}