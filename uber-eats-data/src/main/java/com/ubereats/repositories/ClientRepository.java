package com.ubereats.repositories;

import com.ubereats.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
