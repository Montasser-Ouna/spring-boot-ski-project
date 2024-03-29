package tn.esprit.montasser.ski__project.Services;

import tn.esprit.montasser.ski__project.Entities.Skieur;
import tn.esprit.montasser.ski__project.Entities.TypeAbonnement;

import java.util.List;

public interface IskieurService {
    Skieur addSkieur(Skieur s);


    void removeSkieur(Long id);

    Skieur updateSkieur (Skieur s);

    List<Skieur> retrieveAllSkieurs ();

    Skieur retrieveSkieur (Long id);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur assignSkierToAbonnement(Long numSkieur, Long numAbon);

    Skieur addSkierAndAssignToCourse(Skieur skieur);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
    void retrieveSubscriptions();



}
