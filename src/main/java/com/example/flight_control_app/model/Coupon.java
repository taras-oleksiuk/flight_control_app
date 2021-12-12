package com.example.flight_control_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
    @NonNull
    private Long couponId;
    @NonNull
    private Long discounts;
}
