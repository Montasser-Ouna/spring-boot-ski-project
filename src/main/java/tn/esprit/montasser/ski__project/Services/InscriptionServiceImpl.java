package tn.esprit.montasser.ski__project.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.montasser.ski__project.Entities.Cours;
import tn.esprit.montasser.ski__project.Entities.Inscription;
import tn.esprit.montasser.ski__project.Entities.Skieur;
import tn.esprit.montasser.ski__project.Entities.TypeCours;
import tn.esprit.montasser.ski__project.Repositories.CoursRepo;
import tn.esprit.montasser.ski__project.Repositories.InscriptionRepo;
import tn.esprit.montasser.ski__project.Repositories.SkieurRepo;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Service
public class InscriptionServiceImpl implements IInscriptionService {
    private InscriptionRepo inscriptionRepo;
    private SkieurRepo skieurRepo;
    private CoursRepo coursRepo;

    @Override
    public List<Inscription> retrieveAllInscription() {
        return inscriptionRepo.findAll();
    }

    @Override
    public Inscription addInscription(Inscription cours) {
        return inscriptionRepo.save(cours);
    }

    @Override
    public Inscription updateInscription(Inscription cours) {
        return inscriptionRepo.save(cours);
    }


    @Override
    public Inscription retrieveInscription(Long numCours) {
        return inscriptionRepo.findById(numCours).orElse(null);
    }

    @Override
    public void remove(Long id) {
        inscriptionRepo.deleteById(id);
    }

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        Cours c = coursRepo.findById(numCours).orElse(null);
        Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        int compteur = 0;
        for (Inscription i : c.getInscriptions()) {
            if (i.getSkieur() != null) {
                compteur++;
            }
        }
        if (compteur < 6) {
            long years = java.time.temporal.ChronoUnit.YEARS.between(skieur.getDateNaissance(), LocalDate.now());
            System.out.println(years);
            if (years < 18) {
                if (c.getTypeCours() == TypeCours.COLLECTIF_ENFANT) {
                    inscription.setCours(c);
                    inscription.setSkieur(skieur);
                }
            } else if (years > 18) {
                if (c.getTypeCours() == TypeCours.COLLECTIF_ADULTE) {
                    inscription.setCours(c);
                    inscription.setSkieur(skieur);
                }
            }
        }
        return inscriptionRepo.save(inscription);
    }
}
