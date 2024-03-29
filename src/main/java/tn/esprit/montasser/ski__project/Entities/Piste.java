package tn.esprit.montasser.ski__project.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numPiste;
    String nomPiste;
    @Enumerated(EnumType.STRING)
    Couleur couleur;
    Integer longeur;
    Integer Pente;
    @ManyToMany(mappedBy = "pistes",cascade = CascadeType.REMOVE)
    Set<Skieur>skieurs;


}
