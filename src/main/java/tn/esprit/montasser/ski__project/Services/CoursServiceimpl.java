package tn.esprit.montasser.ski__project.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.montasser.ski__project.Entities.Cours;
import tn.esprit.montasser.ski__project.Repositories.CoursRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class CoursServiceimpl implements ICoursService {
    private CoursRepo coursRepo;
    @Override
    public List<Cours> retrieveAllCourses() {
        return coursRepo.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepo.findById(numCours).orElse(null);
    }

    @Override
    public void remove(Long id) {
        coursRepo.deleteById(id);

    }


}
