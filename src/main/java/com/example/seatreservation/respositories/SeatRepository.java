package com.example.seatreservation.respositories;

import com.example.seatreservation.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Customer, Long> {
    List<Customer> findSeatsById(long kw);
}
