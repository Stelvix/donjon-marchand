package fr.epsi.donjon_marchand.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Id_Commande;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    public OffsetDateTime Date_creation;

    @Enumerated
    @Column(nullable = false)
    private StatutCommande Statut;

    @Column(nullable = false)
    public BigDecimal prix;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
    public List<LigneCommande> ligneCommandes;


    public long getId_Commande() {
        return Id_Commande;
    }

    public void setId_Commande(long id_Commande) {
        Id_Commande = id_Commande;
    }

    public OffsetDateTime getDate_creation() {
        return Date_creation;
    }

    public void setDate_creation(OffsetDateTime date_creation) {
        Date_creation = date_creation;
    }

    public StatutCommande getStatut() {
        return Statut;
    }

    public void setStatut(StatutCommande statut) {
        Statut = statut;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public List<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }
}
