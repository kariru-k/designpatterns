package com.example.designpatterns.creationalpatterns.prototype.VehicleInterface;

import java.util.Objects;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String color;

    public Vehicle() {

    }

    public Vehicle(Vehicle vehicle){
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public abstract Vehicle clone();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object2){
        if (!(object2 instanceof Vehicle)) {
            return false;
        }
        Vehicle vehicle2 = (Vehicle) object2;
        return Objects.equals(vehicle2.getBrand(), brand) && Objects.equals(vehicle2.getColor(), color) && Objects.equals(vehicle2.getModel(), model);
    }
}
