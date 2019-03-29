package com.ubereats.services.map;

import com.ubereats.model.Dish;
import com.ubereats.services.CategoryService;
import com.ubereats.services.PremisesService;
import org.springframework.stereotype.Service;
import com.ubereats.services.DishService;

import java.util.Set;
@Service
public class DishServiceMap extends AbstractMapService<Dish,Long> implements DishService {

    private final PremisesService premisesService;
    private final CategoryService categoryService;

    public DishServiceMap(PremisesService premisesService, CategoryService categoryService) {
        this.premisesService = premisesService;
        this.categoryService = categoryService;
    }

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
