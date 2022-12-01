package com.cyst.software;

public class Taxi extends MotorVehicles implements IMoney,ITemperature{

    @Override
    public void charge() {
        System.out.println("收费十元");
    }

    @Override
    public void controlAirTemperature() {

    }
}
