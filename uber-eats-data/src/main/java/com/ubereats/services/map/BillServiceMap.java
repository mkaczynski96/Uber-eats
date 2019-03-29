package com.ubereats.services.map;

import com.ubereats.model.Bill;
import com.ubereats.repositories.DishRepository;
import com.ubereats.services.ClientService;
import com.ubereats.services.PremisesService;
import org.springframework.stereotype.Service;
import com.ubereats.services.BillService;

import java.util.Set;

@Service
public class BillServiceMap extends AbstractMapService<Bill,Long> implements BillService {

    private final ClientService clientService;
    private final DishRepository dishRepository;
    private final PremisesService premisesService;

    public BillServiceMap(ClientService clientService, DishRepository dishRepository, PremisesService premisesService) {
        this.clientService = clientService;
        this.dishRepository = dishRepository;
        this.premisesService = premisesService;
    }

    @Override
    public Set<Bill> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Bill object) {
        super.delete(object);
    }

    @Override
    public Bill save(Bill object) {
        return super.save(object);
    }

    @Override
    public Bill findById(Long id) {
        return super.findById(id);
    }
}
