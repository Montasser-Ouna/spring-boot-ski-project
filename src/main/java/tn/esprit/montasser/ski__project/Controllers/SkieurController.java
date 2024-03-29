package tn.esprit.montasser.ski__project.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.montasser.ski__project.Entities.Skieur;
import tn.esprit.montasser.ski__project.Entities.TypeAbonnement;
import tn.esprit.montasser.ski__project.Services.IskieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurController {
    private IskieurService iskieurService;


    @PostMapping("/add")
    public Skieur addSkieur(@RequestBody Skieur s) {
        return iskieurService.addSkieur(s);
    }

    @PutMapping("/update")
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return iskieurService.updateSkieur(skieur);
    }

    @GetMapping("/get/{id}")
    public Skieur getSkieur(@PathVariable("id") Long numSkieur) {
        return iskieurService.retrieveSkieur(numSkieur);
    }

    @GetMapping("/getAll")
    public List<Skieur> getAllSkieurs() {
        return iskieurService.retrieveAllSkieurs();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iskieurService.removeSkieur(id);
    }
    @PutMapping("/{numSkieur}/{numPiste}")
    Skieur assignSkierToPiste(@PathVariable Long numSkieur, @PathVariable Long numPiste) {
        return iskieurService.assignSkierToPiste(numSkieur, numPiste);
    }
    @PutMapping("/rest/{numSkieur}/{numAbon}")
    Skieur assignSkierToAbonnement(@PathVariable Long numSkieur, @PathVariable Long numAbon) {
        return iskieurService.assignSkierToAbonnement(numSkieur, numAbon);
    }

    @PostMapping("/skieurabin")
    public Skieur addSkierAndAssignToCourse(@RequestBody Skieur skieur) {

        return iskieurService.addSkierAndAssignToCourse(skieur);
    }
    @GetMapping("skieurByTypeAbon/{typeAbonnement}")
    public List<Skieur> retrieveSkiersBySubscriptionType(@PathVariable TypeAbonnement typeAbonnement){
        return iskieurService.retrieveSkiersBySubscriptionType(typeAbonnement);
    }

}
