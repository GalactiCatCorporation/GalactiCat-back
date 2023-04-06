package com.galacticat.galacticat.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="Vol")
public class Vol {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @OneToOne
    @JoinColumn(name = "PLANETE_ID_DEPART")
    private Planete depart;
    @OneToOne
    @JoinColumn(name = "PLANETE_ID_ARRIVEE")
    private Planete arrivee;
    @OneToOne
    @JoinColumn(name = "PLANETE_ID_etape")
    private Planete etape;
    private LocalDateTime dateDepart;
    @Column
    private String vaisseau;

    @OneToOne
    @JoinColumn(name = "CASTRONAUTE_ID_PILOTE")
    private Catstronaute pilote;

    @OneToMany
    @JoinColumn(name= "CASTRONAUTE_ID_PASSAGERS")
    private List<Catstronaute> passager = new ArrayList<>();
}
