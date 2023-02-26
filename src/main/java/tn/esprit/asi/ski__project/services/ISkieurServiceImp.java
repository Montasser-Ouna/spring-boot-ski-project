package tn.esprit.asi.ski__project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski__project.entities.Skieur;
import tn.esprit.asi.ski__project.repositories.SkieurRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class ISkieurServiceImp implements ISkieurService{
    @Autowired
    private SkieurRepository skieurRepository;
    @Override
    public void add(Skieur s) {
        skieurRepository.save(s);

    }

    @Override
    public Skieur update(Skieur s) {
        return skieurRepository.save(s);
    }
    @Override
    public List<Skieur> getAll() {


        return (List<Skieur>) skieurRepository.findAll();
    }
    @Override
    public Skieur getById(long id) {
        return null;
    }

    @Override
    public void remove(long id) {
        skieurRepository.deleteById(id);

    }
}
