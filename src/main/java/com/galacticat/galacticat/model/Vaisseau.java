package com.galacticat.galacticat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="vaisseau")
public class Vaisseau {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nom;
    private String modele;
    private Integer nombrePlace;

    public Vaisseau() {
    }

    public Vaisseau(String id, String nom, String modele, Integer nombrePlace) {
        this.id = id;
        this.nom = nom;
        this.modele = modele;
        this.nombrePlace = nombrePlace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Integer getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(Integer nombrePlace) {
        this.nombrePlace = nombrePlace;
    }
}
