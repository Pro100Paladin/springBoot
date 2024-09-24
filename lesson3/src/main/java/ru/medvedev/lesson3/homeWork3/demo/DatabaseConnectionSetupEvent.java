package ru.medvedev.lesson3.homeWork3.demo;

import org.springframework.context.ApplicationEvent;

public class DatabaseConnectionSetupEvent extends ApplicationEvent {

  public DatabaseConnectionSetupEvent(Object source) {
    super(source);
  }

}
