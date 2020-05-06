package com.petclinic.springpetclinic.repositories;

import com.petclinic.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
