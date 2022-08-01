package com.metropolitan.IT355PZ.repository;

import com.metropolitan.IT355PZ.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {
    Coupon findByIdCoupon(Integer idCoupon);
}