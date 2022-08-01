package com.metropolitan.IT355PZ.service.impl;

import com.metropolitan.IT355PZ.entity.Coupon;
import com.metropolitan.IT355PZ.repository.CouponRepository;
import com.metropolitan.IT355PZ.service.CouponService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CouponServiceImpl implements CouponService {
    
    private final CouponRepository couponRepository;

    @Override
    public List<Coupon> findAll() {
        return couponRepository.findAll();
    }

    @Override
    public Coupon findById(Integer idCoupon) {
        return couponRepository.findByIdCoupon(idCoupon);
    }

    @Override
    public Coupon save(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @Override
    public Coupon update(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @Override
    public void deleteById(Integer idCoupon) {
        couponRepository.deleteById(idCoupon);
    }
    
}