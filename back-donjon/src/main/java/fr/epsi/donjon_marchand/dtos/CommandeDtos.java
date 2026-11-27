package fr.epsi.donjon_marchand.dtos;

import fr.epsi.donjon_marchand.models.StatutCommande;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class CommandeDtos {
    public Long id;
    public OffsetDateTime dateCreation;
    public StatutCommande statut;
    public List<LigneCommandeDto> lignes;
    public BigDecimal prix;
}
