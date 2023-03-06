package tn.esprit.asi.ski__project.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski__project.entities.Abonnement;
import tn.esprit.asi.ski__project.entities.Skieur;
import tn.esprit.asi.ski__project.entities.TypeAbonnement;

import java.util.Set;

public interface AbonnementRepository extends CrudRepository<Abonnement,Long> {
    Set<Abonnement> findByTybeAbonnement(TypeAbonnement type);
}
