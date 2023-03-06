package tn.esprit.asi.ski__project.services;

import org.springframework.stereotype.Service;
import tn.esprit.asi.ski__project.entities.Abonnement;
import tn.esprit.asi.ski__project.entities.Cours;
import tn.esprit.asi.ski__project.entities.Skieur;

import java.util.List;


public interface IAbonnementService {
    void add(Abonnement a);

    Abonnement update(Abonnement a);

    List<Abonnement> getAll();

    Abonnement getById(long id);

    void remove(long id);


}
