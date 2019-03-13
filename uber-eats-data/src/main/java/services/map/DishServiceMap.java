package services.map;

import model.Dish;
import services.DishService;

import java.util.Set;

public class DishServiceMap extends AbstractMapService<Dish,Long> implements DishService {
    @Override
    public Dish findByName(String name) {
        return null;
    }

    @Override
    public Set<Dish> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Dish object) {
        super.delete(object);
    }

    @Override
    public Dish save(Dish object) {
        return super.save(object);
    }

    @Override
    public Dish findById(Long id) {
        return super.findById(id);
    }
}
