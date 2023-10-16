package tn.esprit.com.foyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.com.foyer.entities.Reservation;
import tn.esprit.com.foyer.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServices implements IReservationService {
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return null;
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return null;
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return null;
    }

    @Override
    public void removeReservation(Long idReservation) {

    }
}