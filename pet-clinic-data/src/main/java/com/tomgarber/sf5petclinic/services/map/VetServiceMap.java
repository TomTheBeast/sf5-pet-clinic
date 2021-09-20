package com.tomgarber.sf5petclinic.services.map;

import com.tomgarber.sf5petclinic.model.Vet;
import com.tomgarber.sf5petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap  extends AbstractMapService<Vet, Long>  implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}