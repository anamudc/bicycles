package com.example.demo.repositories;

import com.example.demo.domain.Bicycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BicycleRepositoryImpl implements BicycleRepository {

    final BicycleJPA bicycleJPA;

    @Autowired
    public BicycleRepositoryImpl(BicycleJPA bicycleJPA) {
        this.bicycleJPA = bicycleJPA;
    }

    @Override
    public Bicycle create(Bicycle bicycle) {
        return toDomain(bicycleJPA.save(toEntity(bicycle)));
    }

    @Override
    public Bicycle update(Bicycle bicycle) {
        return null;
    }

    @Override
    public Bicycle find(Long id) {
        return null;
    }

    @Override
    public Bicycle delete(Long id) {
        return null;
    }

    private BicycleEntity toEntity (Bicycle bicycle) {
        return new BicycleEntity(bicycle.getId(), bicycle.getType(), bicycle.getSerial(), bicycle.getBrand());
    }

    private Bicycle toDomain (BicycleEntity bicycle) {
        return new Bicycle(bicycle.getId(), bicycle.getType(), bicycle.getSerial(), bicycle.getBrand());
    }
}
