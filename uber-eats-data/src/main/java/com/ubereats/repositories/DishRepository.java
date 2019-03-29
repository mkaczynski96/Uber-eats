package com.ubereats.repositories;

import com.ubereats.model.Dish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface DishRepository extends CrudRepository<Dish, Long> {

    Dish findByName(String name);
}
