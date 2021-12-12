package com.example.flight_control_app.service;

import com.example.flight_control_app.model.Baggage;

public interface BaggageService {
    Baggage save(Baggage baggage);

    boolean checkInBaggageDirection(Long baggageId, Long destinationId);
}
