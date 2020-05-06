package com.petclinic.springpetclinic.repositories;

import com.petclinic.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
