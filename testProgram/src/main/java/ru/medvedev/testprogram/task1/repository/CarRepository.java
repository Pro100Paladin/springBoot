package ru.medvedev.testprogram.task1.repository;

import org.springframework.stereotype.Repository;
import ru.medvedev.testprogram.task1.Car;
import ru.medvedev.testprogram.task1.Engine;

import java.util.List;
import java.util.Scanner;

@Repository
public class CarRepository {

   static Scanner scanner = new Scanner(System.in);

    private static List<Car> cars = List.of();

    public CarRepository(List<Car> cars) {
        CarRepository.cars = cars;
        cars.add(new Car("BMW", "X5", "black", new Engine("gaz", 300), 245));
        cars.add(new Car("Mercedes", "600", "red", new Engine("diz", 600), 290));
    }

    public static List<Car> getCars() {
        return List.copyOf(cars);
    }

    public static List<Car> addCar(Car car) {
        cars.add(new Car(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),new Engine(scanner.nextLine(), scanner.nextInt()), scanner.nextInt()));
        return cars;
    }
}
