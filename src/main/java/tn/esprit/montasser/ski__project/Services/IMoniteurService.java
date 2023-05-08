package tn.esprit.montasser.ski__project.Services;

import tn.esprit.montasser.ski__project.Entities.Moniteur;
import tn.esprit.montasser.ski__project.Entities.Support;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
    void remove(Long id);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse);

    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support);


}
