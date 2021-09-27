package com.tomgarber.sf5petclinic.repositories;

import com.tomgarber.sf5petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
