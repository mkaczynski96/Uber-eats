package com.ubereats.services;

import com.ubereats.model.Category;

public interface CategoryService extends CrudService<Category, Long> {

    Category findByName(String name);
}
