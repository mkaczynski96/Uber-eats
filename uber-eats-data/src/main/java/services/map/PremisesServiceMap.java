package services.map;

import model.Premises;
import services.PremisesService;

import java.util.Set;

public class PremisesServiceMap extends AbstractMapService<Premises,Long> implements PremisesService {
    @Override
    public Premises findByName(String name) {
        return null;
    }

    @Override
    public Premises findByAddress(String address) {
        return null;
    }

    @Override
    public Set<Premises> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Premises object) {
        super.delete(object);
    }

    @Override
    public Premises save(Premises object) {
        return super.save(object);
    }

    @Override
    public Premises findById(Long id) {
        return super.findById(id);
    }
}
