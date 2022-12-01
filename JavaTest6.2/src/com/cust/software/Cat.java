package com.cust.software;

public class Cat implements Animals{

    @Override
    public void AnimalsTools() {
        System.out.println("猫会跳环");
    }

    @Override
    public void AnimalsEat() {
        System.out.println("猫吃鱼");
    }
}
