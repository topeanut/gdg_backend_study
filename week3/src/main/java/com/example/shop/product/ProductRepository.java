package com.example.shop.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager em;

    // 제품 등록
    public void save(Product product) {
        if (product.getId() == null) { // 새 엔티티
            em.persist(product);
        } else { // 기존 엔티티 수정
            em.merge(product);
        }
    }

    // 모든 제품 목록 조회
    public List<Product> findAll() {
        return em.createQuery("SELECT p FROM Product p", Product.class)
                .getResultList();
    }

    // ID로 제품 상세 조회
    public Product findById(Long id) {
        return em.find(Product.class, id);
    }

    // 업데이트 기능은 save() 메서드로 처리 가능 (merge 사용)

    // 제품 삭제
    public void deleteById(Long id) {
        Product product = em.find(Product.class, id);
        if (product != null) {
            em.remove(product);
        }
    }
}