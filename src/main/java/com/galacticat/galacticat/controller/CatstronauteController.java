package com.galacticat.galacticat.controller;

import com.galacticat.galacticat.model.Catstronaute;
import com.galacticat.galacticat.repository.UserRepository;
import com.galacticat.galacticat.request.CatstronauteUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/catstronautes")
public class CatstronauteController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping
  public List<Catstronaute> getAllCatstronautes() {
    return userRepository.findAll();
  }

  @PostMapping
  public Catstronaute createCatstronaute(@RequestBody Catstronaute catstronaute) {
    return userRepository.save(catstronaute);
  }

  @PutMapping("/{catstronauteId}")
  public ResponseEntity<Catstronaute> updateCatstronaute(@PathVariable Integer catstronauteId, @RequestBody CatstronauteUpdateRequest updateRequest) {
    System.out.println("test");
    Optional<Catstronaute> optionalCatstronaute = userRepository.findById(catstronauteId);

    if (optionalCatstronaute.isPresent()) {
      Catstronaute catstronaute = optionalCatstronaute.get();

      if (updateRequest.getVaisseau() != null) {
        catstronaute.setVaisseau(updateRequest.getVaisseau());
      }
      if (updateRequest.getBio() != null) {
        catstronaute.setBio(updateRequest.getBio());
      }
      if (updateRequest.getEmail() != null) {
        catstronaute.setEmail(updateRequest.getEmail());
      }
      if (updateRequest.getImageProfilUrl() != null) {
        catstronaute.setImageProfilUrl(updateRequest.getImageProfilUrl());
      }

      Catstronaute updatedCatstronaute = userRepository.save(catstronaute);
      return ResponseEntity.ok(updatedCatstronaute);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  // Ajoutez d'autres méthodes pour gérer les requêtes HTTP (PUT, DELETE, etc.)
}
