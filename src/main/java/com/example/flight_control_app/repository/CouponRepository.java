package com.example.flight_control_app.repository;

import com.example.flight_control_app.model.Coupon;

public interface CouponRepository {
    Coupon save(Coupon coupon);

    Coupon findById(Long id);
}
