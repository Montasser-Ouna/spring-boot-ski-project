package tn.esprit.asi.ski__project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski__project.entities.Abonnement;
import tn.esprit.asi.ski__project.services.IAbonnementService;


import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/abon")
public class AbonnementController {


        @Autowired
        private IAbonnementService iAbonnementService;

        @PostMapping
        public void add(@RequestBody Abonnement a){

                iAbonnementService.add(a);
        }

        @PutMapping
        public Abonnement update(@RequestBody Abonnement a){
                return iAbonnementService.update(a);
        }

        @GetMapping
        public List<Abonnement> getAll(){
                return (List<Abonnement>) iAbonnementService.getAll();
        }

        @GetMapping("/{id}")
        public Abonnement getById(@PathVariable long id){
                return iAbonnementService.getById(id);
        }
        @DeleteMapping("/{id}")
        void remove(@PathVariable long id)
        {iAbonnementService.remove(id);}
}
