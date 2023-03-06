package tn.esprit.asi.ski__project.services;

import tn.esprit.asi.ski__project.entities.Skieur;
import tn.esprit.asi.ski__project.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    void add(Skieur s);
    Skieur update(Skieur s);
    List<Skieur> getAll();
    Skieur getById(long id);
    void remove(long id);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);

    Skieur assignSkieurtoAbonnement(long numSkieur, long numAbon);

    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

}
