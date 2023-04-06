package com.galacticat.galacticat.controller;

import com.galacticat.galacticat.model.Vol;
import com.galacticat.galacticat.request.VolRequest;
import com.galacticat.galacticat.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}