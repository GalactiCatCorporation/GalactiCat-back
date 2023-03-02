package com.galacticat.galacticat.service;

import com.galacticat.galacticat.model.Catstronaute;
import org.springframework.data.repository.CrudRepository;

public interface CatstronauteDAO extends CrudRepository<Catstronaute, Integer> {
}
