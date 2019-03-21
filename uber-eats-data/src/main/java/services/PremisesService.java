package services;

import model.Premises;

public interface PremisesService extends CrudService<Premises,Long> {

    Premises findByName(String name);
    Premises findByAddress(String address);
}
