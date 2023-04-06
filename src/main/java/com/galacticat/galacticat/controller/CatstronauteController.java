package com.galacticat.galacticat.controller;

import com.galacticat.galacticat.model.Catstronaute;
import com.galacticat.galacticat.repository.UserRepository;
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

  @PutMapping("/{catstronauteId}/vaisseau")
  public ResponseEntity<Catstronaute> updateVaisseau(@PathVariable Integer catstronauteId, @RequestBody String vaisseau) {
    Optional<Catstronaute> optionalCatstronaute = userRepository.findById(catstronauteId);

    if (optionalCatstronaute.isPresent()) {
      Catstronaute catstronaute = optionalCatstronaute.get();
      catstronaute.setVaisseau(vaisseau);
      Catstronaute updatedCatstronaute = userRepository.save(catstronaute);
      return ResponseEntity.ok(updatedCatstronaute);
    } else {
      return ResponseEntity.notFound().build();
    }
  }
  @PutMapping("/{catstronauteId}/bio")
  public ResponseEntity<Catstronaute> updateBio(@PathVariable Integer catstronauteId, @RequestBody String bio) {
    Optional<Catstronaute> optionalCatstronaute = userRepository.findById(catstronauteId);

    if (optionalCatstronaute.isPresent()) {
      Catstronaute catstronaute = optionalCatstronaute.get();
      catstronaute.setBio(bio);
      Catstronaute updatedCatstronaute = userRepository.save(catstronaute);
      return ResponseEntity.ok(updatedCatstronaute);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PutMapping("/{catstronauteId}/email")
  public ResponseEntity<Catstronaute> updateEmail(@PathVariable Integer catstronauteId, @RequestBody String email) {
    Optional<Catstronaute> optionalCatstronaute = userRepository.findById(catstronauteId);

    if (optionalCatstronaute.isPresent()) {
      Catstronaute catstronaute = optionalCatstronaute.get();
      catstronaute.setEmail(email);
      Catstronaute updatedCatstronaute = userRepository.save(catstronaute);
      return ResponseEntity.ok(updatedCatstronaute);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  // Ajoutez d'autres méthodes pour gérer les requêtes HTTP (PUT, DELETE, etc.)
}
