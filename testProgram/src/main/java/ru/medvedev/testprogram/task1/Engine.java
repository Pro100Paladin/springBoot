package ru.medvedev.testprogram.task1;

import lombok.Data;

@Data
public class Engine {

    private String typeEngine;
    private int power;

    public Engine(String typeEngine, int power) {
        this.typeEngine = typeEngine;
        this.power = power;
    }

    @Override
    public String toString() {
        return "typeEngine: '" + typeEngine +
                ", power: " + power;
    }
}
