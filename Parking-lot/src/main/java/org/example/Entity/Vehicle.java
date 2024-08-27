package org.example.Entity;

public class Vehicle {
    private Vehicle_type vehicleType;
    private  String regNo;
    private  String color;

    public Vehicle(Vehicle_type vehicleType, String regNo, String color) {
        this.vehicleType = vehicleType;
        this.regNo = regNo;
        this.color = color;
    }

    public Vehicle_type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle_type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
