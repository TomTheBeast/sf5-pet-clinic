package com.tomgarber.sf5petclinic.repositories;

import com.tomgarber.sf5petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
