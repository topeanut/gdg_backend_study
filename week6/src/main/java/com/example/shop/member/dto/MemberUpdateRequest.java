package com.example.shop.member.dto;
// password, phoneNumber, address

import com.example.shop.common.ErrorMessages;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberUpdateRequest {
    @Size(min = 8, max = 20, message = ErrorMessages.PASSWORD_SIZE)
    private String password;

    @Pattern(regexp = "^010-\\d{4}-\\d{4}$", message = ErrorMessages.PHONE_NUMBER_PATTERN)
    private String phoneNumber;

    @Size(min = 1, max = 255, message = ErrorMessages.ADDRESS_SIZE)
    private String address;
}
