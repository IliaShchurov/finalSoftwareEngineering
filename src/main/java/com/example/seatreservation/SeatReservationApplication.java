package com.example.seatreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeatReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeatReservationApplication.class, args);
	}

//	    @Bean
//    CommandLineRunner commandLineRunner(SeatRepository seatRepository) {
//        return args -> {
//            studentRepository.save(new Customer(null, "Jam", new Date(), false, 1.2));
//            studentRepository.save(new Student(null, "Jen", new Date(), true, 3.2));
//            studentRepository.findAll().forEach(p -> {
//                System.out.println(p.getName());
//            });
//        };
//    }

}
