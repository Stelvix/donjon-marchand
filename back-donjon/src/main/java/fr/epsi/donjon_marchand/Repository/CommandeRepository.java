package fr.epsi.donjon_marchand.Repository;

import fr.epsi.donjon_marchand.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {}
