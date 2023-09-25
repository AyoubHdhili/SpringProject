package tn.esprit.com.foyer.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name = "idReservation", length = 50)
    private String idReservation; // Clé primaire
    private Date anneeReservation;
    private boolean estValide;
    @ManyToMany(mappedBy="reservations", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
