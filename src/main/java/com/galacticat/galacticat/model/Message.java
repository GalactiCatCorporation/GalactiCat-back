package com.galacticat.galacticat.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Message")
public class Message {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private LocalDateTime dateDepart;

    private String texte;

    @OneToOne
    @JoinColumn(name = "CASTRONAUTE")
    private Catstronaute pilote;
}
