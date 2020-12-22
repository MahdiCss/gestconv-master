package tn.iit.examjee.entities;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Convention implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @NonNull
    @Column(name = "type", length = 50)
    private String type;
    @NonNull
    private String participant1;
    @NonNull
    private String participant2;
    private String participant3;
    private String participant4;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date_edition;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NonNull
    private LocalDate date_signature_partcipant1;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NonNull
    private LocalDate date_signature_partcipant2;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date_signature_partcipant3;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date_signature_partcipant4;
    @NonNull
    private String objet;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NonNull
    private LocalDate date_entree_en_vigueur;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date_expiration;

    public Convention() {
        super();
    }

    public Convention(long id) {
        this.id = id;
    }

    public Convention(long id, String type, String participant1, String participant2, String participant3, String participant4, LocalDate date_edition, LocalDate date_signature_partcipant1, LocalDate date_signature_partcipant2, LocalDate date_signature_partcipant3, LocalDate date_signature_partcipant4, String objet, LocalDate date_entree_en_vigueur, LocalDate date_expiration) {
        this.id = id;
        this.type = type;
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.participant3 = participant3;
        this.participant4 = participant4;
        this.date_edition = date_edition;
        this.date_signature_partcipant1 = date_signature_partcipant1;
        this.date_signature_partcipant2 = date_signature_partcipant2;
        this.date_signature_partcipant3 = date_signature_partcipant3;
        this.date_signature_partcipant4 = date_signature_partcipant4;
        this.objet = objet;
        this.date_entree_en_vigueur = date_entree_en_vigueur;
        this.date_expiration = date_expiration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParticipant1() {
        return participant1;
    }

    public void setParticipant1(String participant1) {
        this.participant1 = participant1;
    }

    public String getParticipant2() {
        return participant2;
    }

    public void setParticipant2(String participant2) {
        this.participant2 = participant2;
    }

    public String getParticipant3() {
        return participant3;
    }

    public void setParticipant3(String participant3) {
        this.participant3 = participant3;
    }

    public String getParticipant4() {
        return participant4;
    }

    public void setParticipant4(String participant4) {
        this.participant4 = participant4;
    }

    public LocalDate getDate_edition() {
        return date_edition;
    }

    public void setDate_edition(LocalDate date_edition) {
        this.date_edition = date_edition;
    }

    public LocalDate getDate_signature_partcipant1() {
        return date_signature_partcipant1;
    }

    public void setDate_signature_partcipant1(LocalDate date_signature_partcipant1) {
        this.date_signature_partcipant1 = date_signature_partcipant1;
    }

    public LocalDate getDate_signature_partcipant2() {
        return date_signature_partcipant2;
    }

    public void setDate_signature_partcipant2(LocalDate date_signature_partcipant2) {
        this.date_signature_partcipant2 = date_signature_partcipant2;
    }

    public LocalDate getDate_signature_partcipant3() {
        return date_signature_partcipant3;
    }

    public void setDate_signature_partcipant3(LocalDate date_signature_partcipant3) {
        this.date_signature_partcipant3 = date_signature_partcipant3;
    }

    public LocalDate getDate_signature_partcipant4() {
        return date_signature_partcipant4;
    }

    public void setDate_signature_partcipant4(LocalDate date_signature_partcipant4) {
        this.date_signature_partcipant4 = date_signature_partcipant4;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public LocalDate getDate_entree_en_vigueur() {
        return date_entree_en_vigueur;
    }

    public void setDate_entree_en_vigueur(LocalDate date_entree_en_vigueur) {
        this.date_entree_en_vigueur = date_entree_en_vigueur;
    }

    public LocalDate getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(LocalDate date_expiration) {
        this.date_expiration = date_expiration;
    }
}
