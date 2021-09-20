package com.tomgarber.sf5petclinic.services;

import com.tomgarber.sf5petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
