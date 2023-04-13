package com.galacticat.galacticat.repository;

import com.galacticat.galacticat.model.Vol;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolRepository extends JpaRepository<Vol, Integer> {
}
