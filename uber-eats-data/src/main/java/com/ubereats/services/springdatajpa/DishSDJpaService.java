package com.ubereats.services.springdatajpa;

import com.ubereats.model.Dish;
import com.ubereats.repositories.CategoryRepository;
import com.ubereats.repositories.DishRepository;
import com.ubereats.repositories.PremisesRepository;
import com.ubereats.services.DishService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class DishSDJpaService implements DishService {

    private final DishRepository dishRepository;
    private final PremisesRepository premisesRepository;
    private final CategoryRepository categoryRepository;

    public DishSDJpaService(DishRepository dishRepository, PremisesRepository premisesRepository, CategoryRepository categoryRepository) {
        this.dishRepository = dishRepository;
        this.premisesRepository = premisesRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Dish findByName(String name) {
        return null;
    }

    @Override
    public Set<Dish> findAll() {
        Set<Dish> dishes = new HashSet<>();
        dishRepository.findAll().forEach(dishes::add);
        return dishes;
    }

    @Override
    public Dish findById(Long aLong) {
        return dishRepository.findById(aLong).orElse(null);
    }

    @Override
    public Dish save(Dish object) {
        return dishRepository.save(object);
    }

    @Override
    public void delete(Dish object) {
        dishRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        dishRepository.deleteById(aLong);
    }
}
