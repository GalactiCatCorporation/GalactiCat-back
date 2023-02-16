package com.galacticat.galacticat.bo;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name="Vol")
public class Vol {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private Integer id;
    @OneToOne
    @JoinColumn(name = "VAISSEAU_ID")
    private Vaisseau vaisseau;

    @OneToOne
    @JoinColumn(name = "PLANETE_ID")
    private Planete depart;

    @OneToOne
    @JoinColumn(name = "PLANETE_ID")
    private Planete arrivée;

}
