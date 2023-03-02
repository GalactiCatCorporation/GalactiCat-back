package com.galacticat.galacticat.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "messagerie")
public class Messagerie {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")

    private String id;
    @OneToMany
    @Column(name = "MESSAGE_ID")
    private List<Message> message = new ArrayList<>();

}
