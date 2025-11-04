package com.example.shop.order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {

    @PersistenceContext
    private EntityManager em;

    // 주문 생성
    public void save(Order order) {
        if (order.getId() == null) { // 새 엔티티
            em.persist(order);
        } else { // 기존 엔티티 수정
            em.merge(order);
        }
    }

    // 모든 주문 목록 조회
    public List<Order> findAll() {
        return em.createQuery("SELECT o FROM Order o", Order.class)
                .getResultList();
    }

    // ID로 주문 상세 조회
    public Order findById(Long id) {
        return em.find(Order.class, id);
    }

    // 주문 취소 (삭제)
    public void deleteById(Long id) {
        Order order = em.find(Order.class, id);
        if (order != null) {
            em.remove(order);
        }
    }
}