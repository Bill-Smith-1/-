package com.cyst.software;

public class Bus extends MotorVehicles implements IMoney{

    @Override
    public void charge() {
        System.out.println("收费2元");
    }
}
