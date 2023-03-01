package org.example;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class World {

    private String person;

    public void attack() {
        System.out.println("世界 ~");
    }
}
