package ru.medvedev.testprogram.task1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.medvedev.testprogram.task1.Car;
import ru.medvedev.testprogram.task1.repository.CarRepository;

import java.util.List;

@RestController
public class Controller {


    private final CarRepository carRepository;

    @Autowired
    public Controller(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    public List<Car> getAllCars() {
     return carRepository.getCars();
    }
}
