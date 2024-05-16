package com.pluralsight;

public class Vehicle {

    private int vin;
    private int year;
    private String make;
    private String model;
    private String VehicleType;
    private String color;
    private int odometere;
    private double price;


    public Vehicle(double price, int odometere, String color, String vehicleType, String model, String make, int year, int vin) {
        this.price = price;
        this.odometere = odometere;
        this.color = color;
        this.VehicleType = vehicleType;
        this.model = model;
        this.make = make;
        this.year = year;
        this.vin = vin;
    }

    }

