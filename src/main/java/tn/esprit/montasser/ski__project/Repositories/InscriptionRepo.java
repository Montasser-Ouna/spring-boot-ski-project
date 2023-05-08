package tn.esprit.montasser.ski__project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.montasser.ski__project.Entities.Inscription;

@Repository
public interface InscriptionRepo extends JpaRepository <Inscription,Long> {

}
