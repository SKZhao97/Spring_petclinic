package com.petclinic.springpetclinic.repositories;

import com.petclinic.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
