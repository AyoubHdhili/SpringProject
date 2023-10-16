package tn.esprit.com.foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.foyer.services.ReservationServices;

@RestController
@AllArgsConstructor
public class ReservationController {
    ReservationServices reservationServices;
}
