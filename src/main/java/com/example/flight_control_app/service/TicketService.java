package com.example.flight_control_app.service;


import com.example.flight_control_app.model.Ticket;

public interface TicketService {
    Ticket save(Ticket ticket);

    Ticket findById(Long id);

    boolean ticketCheckIn(Long ticketId);
}
