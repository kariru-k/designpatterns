package com.example.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

import com.example.designpatterns.prototype.VehicleInterface.Vehicle;
import com.example.designpatterns.prototype.components.Bus;
import com.example.designpatterns.prototype.components.Car;

public class Demo {
    public static void main(String[] args) {
        //* Proving that we created a clone in a different memory location but is the same exact object
        //! Creating a list of the vehicles and their copies
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> vehiclesCopy = new ArrayList<>();

        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setColor("Green");
        car.setTopSpeed(180);

        vehicles.add(car);

        //Creating a clone of the car
        Car anotherCar = (Car) car.clone();
        vehicles.add(anotherCar);

        Bus bus = new Bus();
        bus.setBrand("Toyota");
        bus.setModel("Corolla");
        bus.setColor("Green");
        bus.setWheels(8);
        vehicles.add(bus);

        cloneAndCompare(vehicles, vehiclesCopy);
    }

    private static void cloneAndCompare(List<Vehicle> vehicles, List<Vehicle> vehiclesCopy) {
        for (Vehicle vehicle : vehicles) {
            vehiclesCopy.add(vehicle.clone());
        }

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) != vehiclesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (vehicles.get(i).equals(vehiclesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }

}
