package com.example.demo.domain;

import com.example.demo.repositories.BicycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BicycleServiceImpl implements BicycleService {

    final BicycleRepository bicycleRepository;

    @Autowired
    public BicycleServiceImpl(BicycleRepository bicycleRepository) {
        this.bicycleRepository = bicycleRepository;
    }

    @Override
    public Bicycle create(Bicycle bicycle) {
        return bicycleRepository.create(bicycle);
    }
}
