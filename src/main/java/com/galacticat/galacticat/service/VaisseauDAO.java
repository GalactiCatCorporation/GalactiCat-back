package com.galacticat.galacticat.service;

import com.galacticat.galacticat.model.Vaisseau;
import org.springframework.data.repository.CrudRepository;

public interface VaisseauDAO extends CrudRepository<Vaisseau, Integer> {
}
