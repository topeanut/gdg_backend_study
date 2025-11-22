package com.example.shop.product.dto;

import com.example.shop.common.ErrorMessages;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductUpdateRequest {
    @Size(min = 1, max = 100, message = ErrorMessages.PRODUCT_NAME_SIZE)
    private String name;

    @Min(value = 0, message = ErrorMessages.PRODUCT_PRICE_MIN)
    private Integer price;

    @Size(max = 1000, message = ErrorMessages.PRODUCT_DESCRIPTION_SIZE)
    private String description;
}




