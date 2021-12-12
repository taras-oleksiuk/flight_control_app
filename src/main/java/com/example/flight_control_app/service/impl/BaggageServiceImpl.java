package com.example.flight_control_app.service.impl;

import com.example.flight_control_app.model.Baggage;
import com.example.flight_control_app.repository.BaggageRepository;
import com.example.flight_control_app.service.BaggageService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class BaggageServiceImpl implements BaggageService {
    private final BaggageRepository baggageRepository;
    @Override
    public Baggage save(Baggage baggage) {
        return baggageRepository.save(baggage);
    }

    @Override
    public boolean checkInBaggageDirection(Long baggageId, Long destinationId) {
        log.info("Check-in with baggageId " + baggageId + " and destinationId " + destinationId);
        return baggageRepository.checkInBaggageDirection(baggageId, destinationId);
    }
}
