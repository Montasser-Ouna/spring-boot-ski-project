package tn.esprit.montasser.ski__project.Services;

import tn.esprit.montasser.ski__project.Entities.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
    void remove(Long id);

}
