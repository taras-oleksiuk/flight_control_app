package com.example.flight_control_app.service;

import com.example.flight_control_app.model.Coupon;

public interface CouponService {
    Coupon save(Coupon coupon);

    Coupon findById(Long id);
}
