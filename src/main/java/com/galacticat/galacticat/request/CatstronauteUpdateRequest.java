package com.galacticat.galacticat.request;

import lombok.Data;

@Data
public class CatstronauteUpdateRequest {
    private String vaisseau;
    private String bio;
    private String email;
    private String imageProfilUrl;

    // Getters et setters
}