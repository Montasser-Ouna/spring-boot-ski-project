package tn.esprit.asi.ski__project.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski__project.entities.Skieur;
import tn.esprit.asi.ski__project.entities.TypeAbonnement;
import tn.esprit.asi.ski__project.entities.TypeCours;

import java.util.List;

public interface SkieurRepository extends CrudRepository<Skieur,Long> {
    List<Skieur> findByAbonnementTybeAbonnement(TypeAbonnement typeAbonnement);
    List<Skieur> findByInscriptionListCoursTypeCours(TypeCours typeCours);
}
