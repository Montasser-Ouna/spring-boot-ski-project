package tn.esprit.montasser.ski__project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.montasser.ski__project.Entities.Abonnement;
import tn.esprit.montasser.ski__project.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Repository
public interface AbonnementRepo extends JpaRepository <Abonnement,Long> {

    Set<Abonnement> findByTypeAbonnementOrderByDateDebut(TypeAbonnement type);
    List<Abonnement> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);

   // List<Abonnement>findByPrixAbonAndTypeAbonnement_Mensuel();

}
