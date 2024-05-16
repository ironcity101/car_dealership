package com.pluralsight;

import java.util.ArrayList;

public class DealerShip {
    private String name;
    private String address;
    private String PhoneNumber;

    ArrayList<Vehicle> inventory;

    public DealerShip(String phoneNumber, String address, String name) {
        this.PhoneNumber = phoneNumber;
        this.address = address;
        this.name = name;

    }

    public ArrayList<Vehicle> getVehicleByPrice(double Min, double Max) {
        return inventory;
    }

    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model) {
        return inventory;
    }

    public ArrayList<Vehicle> getVehicleByYear(double min, double max) {
        return inventory;
    }

    public ArrayList<Vehicle> getVehicleBycolor(String color) {
        return inventory;
    }

    public ArrayList<Vehicle> getVehicleByMileage(double min, double max) {
        return inventory;
    }

    public ArrayList<Vehicle> getVehicleByType(String Type) {
        return inventory;
    }

    public ArrayList<Vehicle> getAllVehicle() {
        return inventory;
    }

    public ArrayList<Vehicle> addVehicles(Vehicle sedan) {
        return inventory;
    }
    public ArrayList<Vehicle> removeVehicles(Vehicle sedan){
        return inventory;
    }

}

