package com.example.demo.repositories;

import com.example.demo.domain.Bicycle;

public interface BicycleRepository {

    Bicycle create (Bicycle bicycle);

    Bicycle update (Bicycle bicycle);

    Bicycle find (Long id);

    Bicycle delete (Long id);

}
