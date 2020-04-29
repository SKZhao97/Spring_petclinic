package com.petclinic.springpetclinic.services;

import com.petclinic.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
