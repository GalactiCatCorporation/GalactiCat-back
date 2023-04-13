package com.galacticat.galacticat.service;

import com.galacticat.galacticat.model.Catstronaute;
import com.galacticat.galacticat.model.Etape;
import com.galacticat.galacticat.model.Planete;
import com.galacticat.galacticat.model.Vol;
import com.galacticat.galacticat.repository.PlaneteRepository;
import com.galacticat.galacticat.repository.UserRepository;
import com.galacticat.galacticat.repository.VolRepository;
import com.galacticat.galacticat.request.VolRequest;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Data
public class VolService {

    @Autowired
    private PlaneteRepository planeteRepository;
    @Autowired
    private UserRepository catstronauteRepository;
    @Autowired
    private VolRepository volRepository;

    public List<Vol> getVols() {
        return volRepository.findAll();
    }




    public Vol createVol(VolRequest volRequest) {
        Planete depart = planeteRepository.findByNom(volRequest.getDepart());
        Planete arrivee = planeteRepository.findByNom(volRequest.getArrivee());
        Catstronaute pilote = catstronauteRepository.findById(volRequest.getPilote()).orElse(null);
        LocalDateTime dateDepart = volRequest.getDateDepart();
        List<Planete> etapes = volRequest.getEtapes().stream()
                .map(planeteRepository::findByNom)
                .collect(Collectors.toList());

        Vol vol = new Vol();
        vol.setDepart(depart);
        vol.setArrivee(arrivee);
        vol.setPilote(pilote);
        vol.setDateDepart(dateDepart);

        List<Etape> etapesVol = new ArrayList<>();
        int ordre = 1;
        for (Planete planeteEtape : etapes) {
            System.out.print(ordre);
            Etape etape = new Etape();
            etape.setVol(vol);
            etape.setPlanete(planeteEtape);
            etape.setOrdre(ordre++);
            etapesVol.add(etape);
        }
        vol.setEtapes(etapesVol);
        volRepository.save(vol);
        return vol;
    }
    public Vol updateVol(Integer volId, VolRequest volRequest) {
        Vol vol = volRepository.findById(volId)
                .orElseThrow(() -> new NoSuchElementException("Aucun vol trouvé avec l'ID: " + volId));

        Planete depart = planeteRepository.findByNom(volRequest.getDepart());
        Planete arrivee = planeteRepository.findByNom(volRequest.getArrivee());
        Catstronaute pilote = catstronauteRepository.findById(volRequest.getPilote()).orElse(null);
        LocalDateTime dateDepart = volRequest.getDateDepart();
        List<Planete> etapes = volRequest.getEtapes().stream()
                .map(planeteRepository::findByNom)
                .collect(Collectors.toList());

        vol.setDepart(depart);
        vol.setArrivee(arrivee);
        vol.setPilote(pilote);
        vol.setDateDepart(dateDepart);

        List<Etape> etapesVol = new ArrayList<>();
        int ordre = 1;
        for (Planete planeteEtape : etapes) {
            Etape etape = new Etape();
            etape.setVol(vol);
            etape.setPlanete(planeteEtape);
            etape.setOrdre(ordre++);
            etapesVol.add(etape);
        }
        vol.setEtapes(etapesVol);
        volRepository.save(vol);
        return vol;
    }


}