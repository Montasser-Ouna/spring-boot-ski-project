package tn.esprit.montasser.ski__project.Services;

import tn.esprit.montasser.ski__project.Entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
    void remove(Long id);
}
