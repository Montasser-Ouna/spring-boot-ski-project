package tn.esprit.montasser.ski__project.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.montasser.ski__project.Entities.Moniteur;
import tn.esprit.montasser.ski__project.Entities.Support;
import tn.esprit.montasser.ski__project.Services.IMoniteurService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/moniteur")
public class MoniteurController {

    private IMoniteurService iMoniteurService;

    @PostMapping("/add")
    public Moniteur add(@RequestBody Moniteur p) {
        return iMoniteurService.addMoniteur(p);
    }

    @PutMapping("/update")
    public Moniteur update(@RequestBody Moniteur p) {
        return iMoniteurService.updateMoniteur(p);
    }

    @GetMapping("/get/{id}")
    public Moniteur get(@PathVariable("id") Long id) {
        return iMoniteurService.retrieveMoniteur(id);
    }

    @GetMapping("/getAll")
    public List<Moniteur> getAll() {
        return iMoniteurService.retrieveAllMoniteurs();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iMoniteurService.remove(id);
    }

    @PostMapping("addmoniteurtocourse/{numCourse}")
    public Moniteur addInstructorAndAssignToCourse(@RequestBody Moniteur moniteur,@PathVariable Long numCourse) {

       return iMoniteurService.addInstructorAndAssignToCourse(moniteur,numCourse);
    }
    @GetMapping("numweek/{numInstructor}/{support}")
    public List<Integer> numWeeksCourseOfInstructorBySupport(@PathVariable Long numInstructor,@PathVariable Support support) {
        return iMoniteurService.numWeeksCourseOfInstructorBySupport(numInstructor,support);
    }


}
