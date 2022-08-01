package com.metropolitan.IT355PZ.service;

import com.metropolitan.IT355PZ.entity.Coupon;
import java.util.List;

public interface CouponService {
    List<Coupon> findAll();
    Coupon findById(Integer idCoupon);
    Coupon save(Coupon coupon);
    Coupon update(Coupon coupon);
    void deleteById(Integer idCoupon);
}