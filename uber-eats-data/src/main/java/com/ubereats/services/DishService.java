package com.ubereats.services;

import com.ubereats.model.Dish;

public interface DishService extends CrudService<Dish,Long> {

    Dish findByName(String name);
}
