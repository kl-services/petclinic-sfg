package com.rjbdev.petclinicsfg.services.map;

import com.rjbdev.petclinicsfg.model.Vet;
import com.rjbdev.petclinicsfg.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService <Vet, Long> implements CrudService<Vet, Long> {

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