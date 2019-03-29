package com.ubereats.services.springdatajpa;

import com.ubereats.model.Bill;
import com.ubereats.repositories.BillRepository;
import com.ubereats.repositories.ClientRepository;
import com.ubereats.repositories.DishRepository;
import com.ubereats.repositories.PremisesRepository;
import com.ubereats.services.BillService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class BillSDJpaService implements BillService {

    private final BillRepository billRepository;
    private final ClientRepository clientRepository;
    private final DishRepository dishRepository;
    private final PremisesRepository premisesRepository;

    public BillSDJpaService(BillRepository billRepository, ClientRepository clientRepository, DishRepository dishRepository, PremisesRepository premisesRepository) {
        this.billRepository = billRepository;
        this.clientRepository = clientRepository;
        this.dishRepository = dishRepository;
        this.premisesRepository = premisesRepository;
    }

    @Override
    public Set<Bill> findAll() {
        Set<Bill> bills = new HashSet<>();
        billRepository.findAll().forEach(bills::add);
        return bills;
    }

    @Override
    public Bill findById(Long aLong) {
        return billRepository.findById(aLong).orElse(null);
    }

    @Override
    public Bill save(Bill object) {
        return billRepository.save(object);
    }

    @Override
    public void delete(Bill object) {
        billRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        billRepository.deleteById(aLong);
    }
}
