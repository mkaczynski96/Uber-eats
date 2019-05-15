package com.ubereats.services.map;

import com.ubereats.model.Category;
import com.ubereats.repositories.DishRepository;
import com.ubereats.services.CategoryService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class CategoryServiceMap extends AbstractMapService<Category, Long> implements CategoryService {

    private final DishRepository dishRepository;

    public CategoryServiceMap(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    public Category findByName(String name) {
        return null;
    }

    @Override
    public Set<Category> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Category object) {
        super.delete(object);
    }

    @Override
    public Category save(Category object) {
        return super.save(object);
    }

    @Override
    public Category findById(Long id) {
        return super.findById(id);
    }
}
