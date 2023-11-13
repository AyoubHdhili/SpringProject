package tn.esprit.com.foyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table( name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoyer")
    Long idFoyer; // Clé primaire
    String nomFoyer;
    Long capaciteFoyer;

    @Column(columnDefinition = "boolean default false")
    boolean archived;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    Set<Bloc> bloc;
}
