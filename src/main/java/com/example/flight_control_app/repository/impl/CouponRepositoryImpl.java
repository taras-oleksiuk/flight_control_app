package com.example.flight_control_app.repository.impl;

import com.example.flight_control_app.model.Coupon;
import com.example.flight_control_app.repository.CouponRepository;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

@Repository
public class CouponRepositoryImpl implements CouponRepository {
    protected HashMap<Long, Coupon> mapOfCoupons = new HashMap<>();

    @Override
    public Coupon save(Coupon coupon) {
        return mapOfCoupons.put(coupon.getCouponId(), coupon);
    }

    @Override
    public Coupon findById(Long id) {
        return mapOfCoupons.get(id);
    }
}
