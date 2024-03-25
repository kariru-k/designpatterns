package com.example.designpatterns.creationalpatterns.prototype.components;

import com.example.designpatterns.creationalpatterns.prototype.VehicleInterface.Vehicle;

public class Bus extends Vehicle{
    private int wheels;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Bus() {}

    public Bus(Bus bus){
        super(bus);
        this.wheels = bus.wheels;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Bus) || !super.equals(object2)) {
            return false;
        }
        Bus bus2 = (Bus) object2;
        return bus2.getWheels() == wheels;
    }
}
