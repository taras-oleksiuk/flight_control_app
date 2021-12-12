package com.example.flight_control_app.user;


import com.example.flight_control_app.model.Baggage;
import com.example.flight_control_app.model.Coupon;
import com.example.flight_control_app.model.Destination;
import com.example.flight_control_app.model.Ticket;
import com.example.flight_control_app.service.BaggageService;
import com.example.flight_control_app.service.CouponService;
import com.example.flight_control_app.service.DestinationService;
import com.example.flight_control_app.service.TicketService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class User implements CommandLineRunner {
    private final TicketService ticketService;
    private final BaggageService baggageService;
    private final DestinationService destinationService;
    private final CouponService couponService;

    @Override
    public void run(String... args) throws Exception {
        loadTickets();
        System.out.println("Ticket service is running: ");
        System.out.println("Ticket service testing the method findById : ");
        Ticket ticketFirst = ticketService.findById(1L);
        System.out.println("Ticket by id 1 : " + ticketFirst);
        Ticket ticketSecond = ticketService.findById(2L);
        System.out.println("Ticket by id 2 : " + ticketSecond);
        System.out.println("Ticket service is testing the method ticketCheckIn: ");
        System.out.println("Is the ticket booked by id 1: " + ticketService.ticketCheckIn(1L));
        System.out.println("Is the ticket booked by id 2: " + ticketService.ticketCheckIn(2L));

        loadBaggage();
        loadDestination();
        System.out.println("Baggage service and destinationService are running: ");
        System.out.println("Baggage service is testing the method checkInBaggageDirection: ");
        System.out.println("Is checkInBaggageDirection with baggage id 1 and direction id 1 is right: "
                + baggageService.checkInBaggageDirection(1L, 1L));
        System.out.println("Is checkInBaggageDirection with baggage id 1 and direction id 2 is right: "
                + baggageService.checkInBaggageDirection(1L, 2L));

        loadCoupons();
        System.out.println("Coupon service is running: ");
        double randomNumber = 1 + Math.random() * 3;
        Long longOfRandomNumber = (long) randomNumber;
        System.out.println("Discount by random number: " + couponService.findById(longOfRandomNumber));
    }

    private void loadTickets() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1L, 100.00, true));
        tickets.add(new Ticket(2L, 200.00, false));
        for (Ticket ticket : tickets) {
            ticketService.save(ticket);
        }
        log.info("Tickets loaded to the DB");
    }

    private void loadBaggage() {
        List<Baggage> baggages = new ArrayList<>();
        baggages.add(new Baggage(1L));
        baggages.add(new Baggage(2L));
        for (Baggage baggage : baggages) {
            baggageService.save(baggage);
        }
        log.info("Baggage loaded to the DB");
    }

    private void loadDestination() {
        List<Destination> destinations = new ArrayList<>();
        destinations.add(new Destination(1L, "Madrid"));
        destinations.add(new Destination(2L, "Berlin"));
        for (Destination destination : destinations) {
            destinationService.save(destination);
        }
        log.info("Destinations loaded to the DB");
    }

    private void loadCoupons() {
        Set<Coupon> coupons = new HashSet<>();
        coupons.add(new Coupon(1L, 10L));
        coupons.add(new Coupon(2L, 50L));
        coupons.add(new Coupon(3L, 60L));
        for (Coupon coupon : coupons) {
            couponService.save(coupon);
        }
        log.info("Coupons loaded to the DB");
    }
}
