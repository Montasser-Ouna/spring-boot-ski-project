package tn.esprit.asi.ski__project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    @Temporal(TemporalType.DATE)
    Date dateNaissance;
    private String ville;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptionList;

    @ManyToMany
    private List<Piste> pisteList;

    @OneToOne(mappedBy = "skieur",cascade = CascadeType.REMOVE  )
    private Abonnement abonnement;


}
