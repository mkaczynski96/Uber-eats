package com.ubereats.bootstrap;

import com.ubereats.model.Category;
import com.ubereats.model.Client;
import com.ubereats.model.Dish;
import com.ubereats.model.Premises;
import com.ubereats.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final BillService billService;
    private final CategoryService categoryService;
    private final ClientService clientService;
    private final DishService dishService;
    private final PremisesService premisesService;

    public DataLoader(BillService billService, CategoryService categoryService, ClientService clientService, DishService dishService, PremisesService premisesService) {
        this.billService = billService;
        this.categoryService = categoryService;
        this.clientService = clientService;
        this.dishService = dishService;
        this.premisesService = premisesService;
    }


    @Override
    public void run(String... args) throws Exception {
        int count = premisesService.findAll().size();
        if(count == 0){
            loadData();
        }
    }

    private void loadData() {

        Premises premises1 = new Premises();
        premises1.setName("McDonald's");
        premises1.setAddress("ul. Gorczewska 123");
        premises1.setRangeDistance(15L);
        Premises savedPremises1 = premisesService.save(premises1);

        Premises premises2 = new Premises();
        premises2.setName("KFC");
        premises2.setAddress("ul. Gorczewska 123");
        premises2.setRangeDistance(20L);
        Premises savedPremises2 = premisesService.save(premises2);

        Category americanFood = new Category();
        americanFood.setName("American");
        Category savedAmericanFood = categoryService.save(americanFood);


        Dish hamburger = new Dish();
        hamburger.setName("Hamburger");
        hamburger.setCategory(savedAmericanFood);
        hamburger.setPrice(4);
        hamburger.setQuantity(1);
        hamburger.setSize("Small");
        hamburger.setPremises(savedPremises1);
        Dish savedHamburger = dishService.save(hamburger);


        Client client1 = new Client();
        client1.setAddress("ul. Jana Krysta 6");
        client1.setPhoneNumber("793-156-322");
        client1.setRangeDistanceToLocal(15L);

        System.out.println("Loaded data");

    }
}
