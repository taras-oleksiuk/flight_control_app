package com.example.flight_control_app.repository.impl;


import com.example.flight_control_app.model.Ticket;
import com.example.flight_control_app.repository.TicketRepository;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

@Repository
public class TicketRepositoryImpl implements TicketRepository {
    protected HashMap<Long, Ticket> mapOfTickets = new HashMap<>();

    @Override
    public Ticket save(Ticket ticket) {
       return mapOfTickets.put(ticket.getId(), ticket);
    }

    @Override
    public Ticket findById(Long id) {
        return mapOfTickets.get(id);
    }

    @Override
    public boolean ticketCheckIn(Long ticketId) {
        Ticket ticket = mapOfTickets.get(ticketId);
        return ticket.getBooked();
    }
}
