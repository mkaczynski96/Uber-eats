package repositories;

import model.Basket;
import org.springframework.data.repository.CrudRepository;

public interface BasketRepository extends CrudRepository<Basket, Long> {
}
