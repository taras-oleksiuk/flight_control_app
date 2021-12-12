package com.example.flight_control_app.repository;

import com.example.flight_control_app.model.Baggage;

public interface BaggageRepository {
    Baggage save(Baggage baggage);

    boolean checkInBaggageDirection(Long baggageId, Long destinationId);
}
