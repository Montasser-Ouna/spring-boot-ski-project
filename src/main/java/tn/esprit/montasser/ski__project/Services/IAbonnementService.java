package tn.esprit.montasser.ski__project.Services;

import tn.esprit.montasser.ski__project.Entities.Abonnement;
import tn.esprit.montasser.ski__project.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();

    Abonnement addAbonnement(Abonnement abonnement);

    Abonnement updateAbonnement(Abonnement abonnement);

    Abonnement retrieveAbonnement(Long numAbonnement);

    void remove(Long id);

    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);

    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);

    //public void showMonthlyRecurringRevenue();
}
