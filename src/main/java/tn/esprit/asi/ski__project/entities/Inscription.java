package tn.esprit.asi.ski__project.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;
    private int numSemaine;

    @ManyToOne
    private Skieur skieur;
    @ManyToOne
    private Cours cours;
}
