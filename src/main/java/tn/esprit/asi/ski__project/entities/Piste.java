package tn.esprit.asi.ski__project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;
    private String nomPoste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int longeur;
    private int pente;
    @ManyToMany(mappedBy = "pisteList")
    private List<Skieur> skieurList;




}
