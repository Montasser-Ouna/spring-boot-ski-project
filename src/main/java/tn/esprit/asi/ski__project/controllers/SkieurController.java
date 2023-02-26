package tn.esprit.asi.ski__project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski__project.entities.Skieur;
import tn.esprit.asi.ski__project.services.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("/Skieur")
public class SkieurController {
    @Autowired
    private ISkieurService iSkieurService;

    @PostMapping
    public void add(@RequestBody Skieur s) {
        iSkieurService.add(s);
    }

    @PutMapping
    public Skieur update(@RequestBody Skieur s) {
        return iSkieurService.update(s);

    }

    @GetMapping
     List<Skieur> getAll()
    {
        return iSkieurService.getAll();
    }

    @GetMapping("/{id}")
    public Skieur getById(@PathVariable long id)
    {
        return iSkieurService.getById(id);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id)

    {
        iSkieurService.remove(id);

    }

}
