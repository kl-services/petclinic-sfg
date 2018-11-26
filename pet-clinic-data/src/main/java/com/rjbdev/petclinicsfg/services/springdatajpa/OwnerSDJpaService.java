package com.rjbdev.petclinicsfg.services.springdatajpa;

import com.rjbdev.petclinicsfg.model.Owner;
import com.rjbdev.petclinicsfg.repositories.OwnerRepository;
import com.rjbdev.petclinicsfg.repositories.PetRepository;
import com.rjbdev.petclinicsfg.repositories.PetTypeRepository;
import com.rjbdev.petclinicsfg.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {
    //Owner Spring Data JPA Service

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();

        ownerRepository.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long aLong) {

        return ownerRepository.findById(aLong).orElse(null);

    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {

        ownerRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {

        ownerRepository.deleteById(aLong);

    }
}
