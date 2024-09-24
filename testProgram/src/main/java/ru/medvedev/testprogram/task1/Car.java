package ru.medvedev.testprogram.task1;


import lombok.Data;

@Data
public class Car {

    private String brand;
    private String model;
    private final Engine engine;
    private String color;
    private int speed;

    public Car(String brand, String model, String color, Engine typeEngine, int speed) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.engine = typeEngine;
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand: '" + brand + '\'' +
                ", model: '" + model + '\'' +
                ", engine: " + engine +
                ", color: '" + color + '\'' +
                ", speed: " + speed +
                '}';
    }
}
