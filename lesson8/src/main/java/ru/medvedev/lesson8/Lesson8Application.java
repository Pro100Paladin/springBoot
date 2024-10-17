package ru.medvedev.lesson8;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import ru.medvedev.lesson8.hanoi.HanoiTower;
import ru.medvedev.lesson8.hanoi.TowerProperties;

@Slf4j
@SpringBootApplication
@EnableConfigurationProperties(TowerProperties.class)
public class Lesson8Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Lesson8Application.class, args);

        HanoiTower hanoiBean = context.getBean(HanoiTower.class);
        hanoiBean.start();
    }

}
