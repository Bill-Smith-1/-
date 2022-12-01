package com.cust.software;

public class Dog implements Animals{

    @Override
    public void AnimalsTools() {
        System.out.println("狗会算数");
    }

    @Override
    public void AnimalsEat() {
        System.out.println("狗吃骨头");
    }
}
