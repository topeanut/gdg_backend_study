package com.example.shop.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private Long memberId;
    private int quantity;
    private boolean canceled = false;

    public Order() {}

    public Order(Long productId, Long memberId, int quantity) {
        this.productId = productId;
        this.memberId = memberId;
        this.quantity = quantity;
    }

    // Builder
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long productId;
        private Long memberId;
        private int quantity;

        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        public Builder memberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Order build() {
            Order o = new Order();
            o.productId = this.productId;
            o.memberId = this.memberId;
            o.quantity = this.quantity;
            return o;
        }
    }

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void cancel() {
        this.canceled = true;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}

