package com.tomgarber.sf5petclinic.repositories;

import com.tomgarber.sf5petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
