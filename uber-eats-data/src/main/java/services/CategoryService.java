package services;

import model.Category;

public interface CategoryService extends CrudService<Category, Long> {

    Category findByName(String name);
}
