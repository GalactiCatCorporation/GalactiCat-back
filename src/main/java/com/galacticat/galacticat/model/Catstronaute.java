package com.galacticat.galacticat.model;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Catstronaute implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (unique = true, length = 15)
    private String pseudo;
    @Column
    private Integer motDePasse;
    @Column
    private String grade;
    @Column
    private String imageProfilUrl;
    @OneToOne
    @JoinColumn(name = "VAISSEAU_ID")
    private Vaisseau vaisseau;

    //private Vols = Vol[];
    public Catstronaute() {
    }

    public Catstronaute(String pseudo, Integer motDePasse, String grade, String imageProfilUrl) {
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.grade = grade;
        this.imageProfilUrl = imageProfilUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Integer getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(Integer motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getImageProfilUrl() {
        return imageProfilUrl;
    }

    public void setImageProfilUrl(String imageProfilUrl) {
        this.imageProfilUrl = imageProfilUrl;
    }
}