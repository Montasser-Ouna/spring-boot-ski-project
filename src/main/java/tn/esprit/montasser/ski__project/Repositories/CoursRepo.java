package tn.esprit.montasser.ski__project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.montasser.ski__project.Entities.Cours;

@Repository
public interface CoursRepo extends JpaRepository<Cours,Long> {

}
