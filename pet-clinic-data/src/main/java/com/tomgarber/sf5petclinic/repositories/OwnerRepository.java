package com.tomgarber.sf5petclinic.repositories;

import com.tomgarber.sf5petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
