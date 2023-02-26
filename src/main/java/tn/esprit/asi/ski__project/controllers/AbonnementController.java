package tn.esprit.asi.ski__project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski__project.entities.Abonnement;
import tn.esprit.asi.ski__project.entities.Skieur;
import tn.esprit.asi.ski__project.services.IAbonnementService;
import tn.esprit.asi.ski__project.services.ISkieurService;

import java.util.List;
@RestController
@RequestMapping("/Abonnement")
public class AbonnementController {


        @Autowired
        private IAbonnementService iAbonnementService;

        @PostMapping
        public void add(@RequestBody Abonnement a) {
            iAbonnementService.add(a);
        }

        @PutMapping
        public Abonnement update(@RequestBody Abonnement a ) {
            return iAbonnementService.update(a);

        }

        @GetMapping
        List<Abonnement> getAll()
        {
            return iAbonnementService.getAll();
        }

        @GetMapping("/{id}")
        public Abonnement getById(@PathVariable long id)
        {
            return iAbonnementService.getById(id);
        }
        @DeleteMapping("/{id}")
        public void remove(@PathVariable long id)
        {
        iAbonnementService.remove(id);
        }
}
