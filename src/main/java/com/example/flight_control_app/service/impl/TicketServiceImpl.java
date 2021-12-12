package com.example.flight_control_app.service.impl;


import com.example.flight_control_app.model.Ticket;
import com.example.flight_control_app.repository.TicketRepository;
import com.example.flight_control_app.service.TicketService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class TicketServiceImpl implements TicketService {
    private TicketRepository ticketRepository;

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket findById(Long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public boolean ticketCheckIn(Long ticketId) {
        log.info("Check-in with ticket id " + ticketId);
        return ticketRepository.ticketCheckIn(ticketId);
    }
}
