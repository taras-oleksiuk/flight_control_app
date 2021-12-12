package com.example.flight_control_app.repository;

import com.example.flight_control_app.model.Ticket;

public interface TicketRepository {
    Ticket save(Ticket ticket);

    Ticket findById(Long id);

    boolean ticketCheckIn(Long ticketId);
}
