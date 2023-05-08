package tn.esprit.montasser.ski__project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.montasser.ski__project.Entities.Moniteur;
import tn.esprit.montasser.ski__project.Entities.Support;

@Repository
public interface MoniteurRepo extends JpaRepository<Moniteur,Long> {
   Moniteur findByNumMonitorAndCoursSupport(Long numMoniteur, Support support);
}
