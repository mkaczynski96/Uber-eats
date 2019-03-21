package repositories;

import model.Premises;
import org.springframework.data.repository.CrudRepository;

public interface PremisesRepository extends CrudRepository<Premises, Long> {

    Premises findByName(String name);
    Premises findByAddress(String address);
}
