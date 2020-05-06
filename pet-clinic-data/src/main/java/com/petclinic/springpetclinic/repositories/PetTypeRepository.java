package com.petclinic.springpetclinic.repositories;

import com.petclinic.springpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<Speciality, Long> {
}
