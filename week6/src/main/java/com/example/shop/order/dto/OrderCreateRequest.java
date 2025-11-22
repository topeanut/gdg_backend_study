package com.example.shop.order.dto;

import com.example.shop.common.ErrorMessages;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateRequest {
    @NotNull(message = ErrorMessages.MEMBER_ID_REQUIRED)
    private Long memberId;

    @NotNull(message = ErrorMessages.PRODUCT_ID_REQUIRED)
    private Long productId;

    @NotNull(message = ErrorMessages.QUANTITY_REQUIRED)
    @Min(value = 1, message = ErrorMessages.QUANTITY_MIN)
    private Integer quantity;
}




