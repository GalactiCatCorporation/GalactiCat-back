package com.galacticat.galacticat;

import com.galacticat.galacticat.service.PlaneteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GalacticatApplication implements CommandLineRunner {

    private final PlaneteService planeteService;

    @Autowired
    public GalacticatApplication(PlaneteService planeteService) {
        this.planeteService = planeteService;
    }

    public static void main(String[] args) {
        SpringApplication.run(GalacticatApplication.class, args);
    }

    @Override
    public void run(String... args) {

    }
}
