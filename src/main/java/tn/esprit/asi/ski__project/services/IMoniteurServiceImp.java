package tn.esprit.asi.ski__project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.asi.ski__project.entities.Cours;
import tn.esprit.asi.ski__project.entities.Moniteur;
import tn.esprit.asi.ski__project.entities.Piste;
import tn.esprit.asi.ski__project.repositories.CoursRepository;
import tn.esprit.asi.ski__project.repositories.MoniteurRepository;

import java.util.List;
@Service
public class IMoniteurServiceImp implements IMoniteurService{
    @Autowired
    private MoniteurRepository moniteurRepository;
    @Autowired
    private CoursRepository coursRepository;
    @Override
    public void add(Moniteur m) {

        moniteurRepository.save(m);
    }

    @Override
    public Moniteur update(Moniteur m) {
        return moniteurRepository.save(m);
    }

    @Override
    public List<Moniteur> getAll() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur getById(long id) {
        return moniteurRepository.findById(id).orElse(null) ;
    }

    @Override
    public void remove(long id) {

        moniteurRepository.deleteById(id);
    }
    public Moniteur addInstructorAndAssignToCourse(Long numMoniteur, Long numCours) {
        // Find the Moniteur entity with the given numMoniteur
        Moniteur moniteur = moniteurRepository.findById(numMoniteur).orElse(null);
        Assert.notNull(moniteur, "moniteur not found");

        // Find the Cours entity with the given numCourse
        Cours cours = coursRepository.findById(numCours).orElse(null);
        Assert.notNull(cours, "cours not found");

        // Set the Moniteur as the instructor for the Cours entity
        cours.setInstructor(moniteur);

        // Add the Cours entity to the Moniteur's list of courses
        moniteur.getCours().add(cours);

        // Save the changes to the database
        coursRepository.save(cours);
        moniteurRepository.save(moniteur);

        return moniteur;
    }

    // other methods

}

