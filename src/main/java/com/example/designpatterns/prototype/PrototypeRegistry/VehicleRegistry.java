package com.example.designpatterns.prototype.PrototypeRegistry;

import java.util.HashMap;
import java.util.Map;

import com.example.designpatterns.prototype.VehicleInterface.Vehicle;
import com.example.designpatterns.prototype.components.Car;

public class VehicleRegistry {
    private Map<String, Vehicle> cache = new HashMap<>();
    
    public VehicleRegistry() {
        Car car = new Car();
        car.setBrand("Bugatti");
        car.setModel("Chiron");
        car.setColor("Green");
        car.setTopSpeed(250);

        cache.put("Bugatti Chiron", car);
    }

    public Vehicle get(String key){
        return cache.get(key).clone();
    }
}
