package com.example.flight_control_app.repository.impl;

import com.example.flight_control_app.exception.DataProcessingException;
import com.example.flight_control_app.model.Baggage;
import com.example.flight_control_app.model.Destination;
import com.example.flight_control_app.repository.BaggageRepository;
import com.example.flight_control_app.repository.DestinationRepository;
import java.util.HashMap;
import java.util.Objects;
import org.springframework.stereotype.Repository;

@Repository
public class DirectionsRepositoryImpl implements BaggageRepository, DestinationRepository {
    protected HashMap<Long, Baggage> mapOfBaggage = new HashMap<>();
    protected HashMap<Long, Destination> mapOfDestination = new HashMap<>();

    @Override
    public Baggage save(Baggage baggage) {
        return mapOfBaggage.put(baggage.getId(), baggage);
    }

    @Override
    public boolean checkInBaggageDirection(Long baggageId, Long destinationId) {
        Baggage baggage = mapOfBaggage.get(baggageId);
        Destination destination = mapOfDestination.get(destinationId);
        if (Objects.equals(baggage.getId(), destination.getId())) {
            return true;
        }
        if (baggage.getId() == null || destination.getId() == null) {
            throw new DataProcessingException("All fields should be filled");
        }
        return false;
    }

    @Override
    public Destination save(Destination destination) {
        return mapOfDestination.put(destination.getId(), destination);
    }
}
