package tn.esprit.montasser.ski__project.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.montasser.ski__project.Entities.Inscription;
import tn.esprit.montasser.ski__project.Services.IInscriptionService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/inscription")
public class InscriptionController {
    private IInscriptionService iInscriptionService;

    @PostMapping("/add")
    public Inscription add(@RequestBody Inscription p) {
        return iInscriptionService.addInscription(p);
    }

    @PutMapping("/update")
    public Inscription update(@RequestBody Inscription p) {
        return iInscriptionService.updateInscription(p);
    }

    @GetMapping("/get/{id}")
    public Inscription get(@PathVariable("id") Long id) {
        return iInscriptionService.retrieveInscription(id);
    }

    @GetMapping("/getAll")
    public List<Inscription> getAll() {
        return iInscriptionService.retrieveAllInscription();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id") Long id) {
        iInscriptionService.remove(id);
    }

    @PostMapping("inscrour/{numSkieur}/{numCours}")
    public Inscription addRegistrationAndAssignToSkierAndCourse(@RequestBody Inscription inscription, @PathVariable Long numSkieur, @PathVariable Long numCours) {
        return iInscriptionService.addRegistrationAndAssignToSkierAndCourse(inscription, numSkieur, numCours);
    }
}
