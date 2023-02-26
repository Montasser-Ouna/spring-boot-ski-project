package tn.esprit.asi.ski__project.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski__project.entities.Moniteur;
import tn.esprit.asi.ski__project.entities.Skieur;

public interface MoniteurRepository extends CrudRepository<Moniteur,Long> {
}
