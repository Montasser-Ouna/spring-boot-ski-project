package tn.esprit.asi.ski__project.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski__project.entities.Abonnement;
import tn.esprit.asi.ski__project.entities.Skieur;

public interface AbonnementRepository extends CrudRepository<Abonnement,Long> {
}
