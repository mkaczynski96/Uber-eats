package com.ubereats.services.springdatajpa;

import com.ubereats.model.Premises;
import com.ubereats.repositories.PremisesRepository;
import com.ubereats.services.PremisesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PremisesSDJpaService implements PremisesService {

    private final PremisesRepository premisesRepository;

    public PremisesSDJpaService(PremisesRepository premisesRepository) {
        this.premisesRepository = premisesRepository;
    }

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
        Set<Premises> premises = new HashSet<>();
        premisesRepository.findAll().forEach(premises::add);
        return premises;
    }

    @Override
    public Premises findById(Long aLong) {
        return premisesRepository.findById(aLong).orElse(null);
    }

    @Override
    public Premises save(Premises object) {
        return premisesRepository.save(object);
    }

    @Override
    public void delete(Premises object) {
        premisesRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        premisesRepository.deleteById(aLong);
    }
}
