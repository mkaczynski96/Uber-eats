package repositories;

import model.Dish;
import org.springframework.data.repository.CrudRepository;

public interface DishRepository extends CrudRepository<Dish, Long> {

    Dish findByName(String name);
}
