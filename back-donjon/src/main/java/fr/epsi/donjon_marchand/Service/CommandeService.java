package fr.epsi.donjon_marchand.Service;

import fr.epsi.donjon_marchand.Repository.CommandeRepository;
import fr.epsi.donjon_marchand.dtos.CommandeDtos;
import fr.epsi.donjon_marchand.models.Commande;
import fr.epsi.donjon_marchand.models.StatutCommande;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Date;

@Service
public class CommandeService {

    private CommandeRepository commandeRepository;

    public CommandeService(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    // creer une commande
    public CommandeDtos creatCommande(CommandeDtos commandeDtos) {
        OffsetDateTime DateActuelle = OffsetDateTime.now();
        Commande Newcommande = new Commande();

        // on met une commande crée en attente par défaut
        Newcommande.setStatut(StatutCommande.EN_ATTENTE);

        Newcommande.setDate_creation(DateActuelle);
        Newcommande.setStatut(CommandeDtos);
        Newcommande.setLigneCommandes(commandeDtos);

        return "" ;
    }

}
