package com.tomgarber.sf5petclinic.repositories;

import com.tomgarber.sf5petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
