package com.galacticat.galacticat.service;


import com.galacticat.galacticat.request.VolRequest;
import com.galacticat.galacticat.model.*;
import com.galacticat.galacticat.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VolService {

    @Autowired
    private PlaneteRepository planeteRepository;
    @Autowired
    private UserRepository catstronauteRepository;
    @Autowired
    private VolRepository volRepository;

    public Vol createVol(VolRequest volRequest) {
        System.out.print(volRequest);
        Planete depart = planeteRepository.findByNom(volRequest.getDepart());
        Planete arrivee = planeteRepository.findByNom(volRequest.getArrivee());
        Catstronaute pilote = catstronauteRepository.findById(volRequest.getPilote()).orElse(null);

        Vol vol = new Vol();
        vol.setDepart(depart);
        vol.setArrivee(arrivee);
        vol.setPilote(pilote);

        return volRepository.save(vol);
    }
}
