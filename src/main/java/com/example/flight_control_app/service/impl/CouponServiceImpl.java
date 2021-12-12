package com.example.flight_control_app.service.impl;

import com.example.flight_control_app.model.Coupon;
import com.example.flight_control_app.repository.CouponRepository;
import com.example.flight_control_app.service.CouponService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CouponServiceImpl implements CouponService {
    private final CouponRepository couponRepository;

    @Override
    public Coupon save(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @Override
    public Coupon findById(Long id) {
        return couponRepository.findById(id);
    }
}
