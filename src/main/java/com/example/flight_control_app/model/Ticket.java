package com.example.flight_control_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @NonNull
    private Long id;
    @NonNull
    private Double ticketPrice;
    @NonNull
    private Boolean booked;
}
