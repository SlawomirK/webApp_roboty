package com.kobylinski.trening;

import com.kobylinski.trening.domain.Robot;
import com.kobylinski.trening.domain.Zadanie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Zadanie zadanie=new Zadanie("zbuduj ogrodzenie");
        Robot robot=new Robot(22,"3PiO",zadanie);
        System.out.println(robot);
    }
}
