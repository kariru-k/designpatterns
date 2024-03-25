package com.example.designpatterns.creationalpatterns.prototype.components;

import com.example.designpatterns.creationalpatterns.prototype.VehicleInterface.Vehicle;

public class Car extends Vehicle{
    private int topSpeed;

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Car() {

    }

    public Car(Car car){
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Car) || !super.equals(object2)) {
            return false;
        }
        Car car2 = (Car) object2;
        return car2.getTopSpeed() == topSpeed;
    }

}
