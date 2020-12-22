package tn.iit.examjee.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Participant {
    @Id
    private long idParticipant;
    @Column(name = "nom", length = 50)
    private String nom;
    private String description;

    public Participant() {
    }

    public Participant(long idParticipant, String nom, String description) {
        this.idParticipant = idParticipant;
        this.nom = nom;
        this.description = description;
    }

    public long getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(long idParticipant) {
        this.idParticipant = idParticipant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
