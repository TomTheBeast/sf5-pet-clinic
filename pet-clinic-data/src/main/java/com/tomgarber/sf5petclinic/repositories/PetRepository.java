package com.tomgarber.sf5petclinic.repositories;

import com.tomgarber.sf5petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
