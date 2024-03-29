package tn.esprit.montasser.ski__project.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.montasser.ski__project.Entities.Piste;
import tn.esprit.montasser.ski__project.Services.IPisteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/piste")
public class PisteController {
    private IPisteService iPisteService;

    @PostMapping("/add")
    public Piste add(@RequestBody Piste p) {
        return iPisteService.addPiste(p);
    }

    @PutMapping("/update")
    public Piste update(@RequestBody Piste p) {
        return iPisteService.updatePiste(p);
    }

    @GetMapping("/get/{id}")
    public Piste get(@PathVariable("id") Long id) {
        return iPisteService.retrievePiste(id);
    }

    @GetMapping("/getAll")
    public List<Piste> getAll() {
        return iPisteService.retrieveAllPistes();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iPisteService.remove(id);
    }
}
