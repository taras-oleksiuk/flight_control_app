package com.example.flight_control_app.repository;

import com.example.flight_control_app.model.Destination;

public interface DestinationRepository {
    Destination save(Destination destination);
}
