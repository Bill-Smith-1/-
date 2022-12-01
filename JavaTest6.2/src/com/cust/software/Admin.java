package com.cust.software;

public class Admin {
    void Job(Animals animal){
        System.out.println("动物的食物是:");
        animal.AnimalsEat();
        System.out.println("动物的技能是:");
        animal.AnimalsTools();
    }
}
