package com.galacticat.galacticat.repository;

import com.galacticat.galacticat.model.Planete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneteRepository extends JpaRepository<Planete, Integer> {
    @Query("SELECT p FROM Planete p WHERE p.nom = :nom")
    Planete findByNom(String nom);
}
