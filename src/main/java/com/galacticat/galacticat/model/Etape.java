package com.galacticat.galacticat.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "etape")
@Data
public class Etape {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @ManyToOne
    @JoinColumn(name = "vol_id")
    private Vol vol;

    @ManyToOne
    @JoinColumn(name = "planete_id")
    private Planete planete;

    @Column(name = "ordre")
    private int ordre;
}
