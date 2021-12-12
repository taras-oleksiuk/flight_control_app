package com.example.flight_control_app.service.impl;

import com.example.flight_control_app.model.Destination;
import com.example.flight_control_app.repository.DestinationRepository;
import com.example.flight_control_app.service.DestinationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DestinationServiceImpl implements DestinationService {
    private DestinationRepository destinationRepository;
    @Override
    public Destination save(Destination destination) {
        return destinationRepository.save(destination);
    }
}
