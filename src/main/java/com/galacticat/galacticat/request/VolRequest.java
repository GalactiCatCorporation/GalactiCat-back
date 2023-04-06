package com.galacticat.galacticat.request;

import com.galacticat.galacticat.model.Catstronaute;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class VolRequest {
    private String depart;
    private String arrivee;
    private List<String> etapes;
    private LocalDateTime dateDepart;
    private String vaisseau;
    private Integer pilote;
    private List<Integer> passagers;
    private String duration;

    // Ajoutez les getters et les setters pour chaque champ ici
}
