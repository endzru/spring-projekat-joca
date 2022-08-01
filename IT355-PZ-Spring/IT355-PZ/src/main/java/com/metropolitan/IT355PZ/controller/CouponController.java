package com.metropolitan.IT355PZ.controller;

import com.metropolitan.IT355PZ.entity.Coupon;
import com.metropolitan.IT355PZ.service.CouponService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupons")
@RequiredArgsConstructor
@CrossOrigin
public class CouponController {
    
    private final CouponService couponService;
    
    @GetMapping("")
    public ResponseEntity<List<Coupon>> getAllCoupons() {
        return ResponseEntity.ok().body(couponService.findAll()); // get coupon list
    }

    @GetMapping("/coupon_id/{idCoupon}")
    public ResponseEntity<Coupon> getById(@PathVariable Integer idCoupon) {
        return ResponseEntity.ok().body(couponService.findById(idCoupon));
    }
    
    @PostMapping
    public ResponseEntity<Coupon> save(@RequestBody Coupon coupon) {
        return ResponseEntity.ok(couponService.save(coupon));
    }
    
    @PutMapping
    public ResponseEntity<Coupon> update(@RequestBody Coupon coupon) {
        return ResponseEntity.ok(couponService.update(coupon));
    }
    
    @DeleteMapping("/{idCoupon}")
    public void deleteById(@PathVariable Integer idCoupon) {
        couponService.deleteById(idCoupon);
    }
    
}