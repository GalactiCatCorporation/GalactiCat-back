package com.galacticat.galacticat.dal;

import com.galacticat.galacticat.bo.Vaisseau;
import org.springframework.data.repository.CrudRepository;

public interface VaisseauDAO extends CrudRepository<Vaisseau, Integer> {
}
