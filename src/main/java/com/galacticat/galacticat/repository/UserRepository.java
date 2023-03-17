package com.galacticat.galacticat.repository;

import java.util.Optional;

import com.galacticat.galacticat.model.Catstronaute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Catstronaute, Integer> {

  Optional<Catstronaute> findByEmail(String email);

}
