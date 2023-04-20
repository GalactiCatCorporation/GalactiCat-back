package com.galacticat.galacticat.controller;

import com.galacticat.galacticat.model.Vol;
import com.galacticat.galacticat.request.VolRequest;
import com.galacticat.galacticat.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vols")
public class VolController {

    private final VolService volService;

    @Autowired
    public VolController(VolService volService) {
        this.volService = volService;
    }

    @PostMapping
    public Vol createVol(@RequestBody VolRequest volRequest) {
        return volService.createVol(volRequest);
    }

    @GetMapping
    public ResponseEntity<List<Vol>> getVols() {
        List<Vol> vols = volService.getVols();
        return ResponseEntity.ok(vols);


    }
    @PutMapping("/{volId}")
    public ResponseEntity<Vol> mettreAJourVol(@PathVariable Integer volId, @RequestBody VolRequest volRequest) {
        System.out.print("Id" + volId );
        Vol vol = volService.updateVol(volId, volRequest);
        return ResponseEntity.ok(vol);
    }


}