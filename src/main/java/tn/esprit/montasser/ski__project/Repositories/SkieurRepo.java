package tn.esprit.montasser.ski__project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.montasser.ski__project.Entities.Skieur;
import tn.esprit.montasser.ski__project.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface SkieurRepo  extends JpaRepository<Skieur,Long> {
    List<Skieur> findByVilleAndNomS(String ville, String nom);
    List<Skieur>findByAbonnementNumAbon(Long numabon);

    List<Skieur> findByAbonnementTypeAbonnement(TypeAbonnement typeAbonnement);

    List<Skieur> findByAbonnementDateFinGreaterThan(LocalDate dateFin);



}
