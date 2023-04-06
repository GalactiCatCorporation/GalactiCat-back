package com.galacticat.galacticat.service;

import com.galacticat.galacticat.model.Planete;
import com.galacticat.galacticat.repository.PlaneteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneteService {

    @Autowired
    private PlaneteRepository planeteRepository;

    public void createPlanets() {
        List<String> planetNames = List.of("Mercure", "Vénus", "Terre", "Mars", "Jupiter", "Saturne", "Uranus");

        for (String planetName : planetNames) {
            Planete planete = new Planete();
            planete.setNom(planetName);
            planeteRepository.save(planete);
        }
    }
}
