package services;

import model.Dish;

public interface DishService extends CrudService<Dish,Long> {

    Dish findByName(String name);
}
