package com.ubereats.repositories;

import com.ubereats.model.Premises;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PremisesRepository extends CrudRepository<Premises, Long> {

    Premises findByName(String name);
    Premises findByAddress(String address);
}
