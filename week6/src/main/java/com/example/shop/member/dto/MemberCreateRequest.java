package com.example.shop.member.dto;

// loginId, password, phoneNumber, address

import com.example.shop.common.ErrorMessages;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberCreateRequest {
    @NotNull(message = ErrorMessages.LOGIN_ID_REQUIRED)
    @Size(min = 4, max = 20, message = ErrorMessages.LOGIN_ID_SIZE)
    private String loginId;

    @NotNull(message = ErrorMessages.PASSWORD_REQUIRED)
    @Size(min = 8, max = 20, message = ErrorMessages.PASSWORD_SIZE)
    private String password;

    @NotNull(message = ErrorMessages.PHONE_NUMBER_REQUIRED)
    @Pattern(regexp = "^010-\\d{4}-\\d{4}$", message = ErrorMessages.PHONE_NUMBER_PATTERN)
    private String phoneNumber;

    @NotNull(message = ErrorMessages.ADDRESS_REQUIRED)
    @Size(min = 1, max = 255, message = ErrorMessages.ADDRESS_SIZE)
    private String address;
}