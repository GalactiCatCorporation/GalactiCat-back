package com.galacticat.galacticat.dal;

import com.galacticat.galacticat.bo.Catstronaute;
import org.springframework.data.repository.CrudRepository;

public interface CatstronauteDAO extends CrudRepository<Catstronaute, Integer> {
}
