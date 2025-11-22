package com.example.shop.common;

public class ErrorMessages {
    
    // Member
    public static final String MEMBER_NOT_FOUND = "회원을 찾을 수 없습니다. ID: %d";
    public static final String DUPLICATE_LOGIN_ID = "이미 존재하는 로그인 아이디입니다: %s";
    
    // Product
    public static final String PRODUCT_NOT_FOUND = "상품을 찾을 수 없습니다. ID: %d";
    
    // Order
    public static final String ORDER_NOT_FOUND = "주문을 찾을 수 없습니다. ID: %d";
    
    // Validation Messages - Member
    public static final String LOGIN_ID_REQUIRED = "로그인 아이디는 필수입니다.";
    public static final String LOGIN_ID_SIZE = "로그인 아이디는 4자 이상 20자 이하입니다.";
    public static final String PASSWORD_REQUIRED = "비밀번호는 필수입니다.";
    public static final String PASSWORD_SIZE = "비밀번호는 8자 이상 20자 이하입니다.";
    public static final String PHONE_NUMBER_REQUIRED = "전화번호는 필수입니다.";
    public static final String PHONE_NUMBER_PATTERN = "전화번호 형식이 올바르지 않습니다.";
    public static final String ADDRESS_REQUIRED = "주소는 필수입니다.";
    public static final String ADDRESS_SIZE = "주소는 1자 이상 255자 이하입니다.";
    
    // Validation Messages - Product
    public static final String PRODUCT_NAME_REQUIRED = "상품명은 필수입니다.";
    public static final String PRODUCT_NAME_SIZE = "상품명은 1자 이상 100자 이하입니다.";
    public static final String PRODUCT_PRICE_REQUIRED = "가격은 필수입니다.";
    public static final String PRODUCT_PRICE_MIN = "가격은 0원 이상이어야 합니다.";
    public static final String PRODUCT_DESCRIPTION_SIZE = "상품 설명은 1000자 이하입니다.";
    
    // Validation Messages - Order
    public static final String MEMBER_ID_REQUIRED = "회원 ID는 필수입니다.";
    public static final String PRODUCT_ID_REQUIRED = "상품 ID는 필수입니다.";
    public static final String QUANTITY_REQUIRED = "수량은 필수입니다.";
    public static final String QUANTITY_MIN = "수량은 1개 이상이어야 합니다.";
    
    private ErrorMessages() {
        // 인스턴스 생성 방지
    }
}

