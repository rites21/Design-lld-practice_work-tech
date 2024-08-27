package org.example.Entity;

public class Parking_slot {

    String id;
    Vehicle_type vehicleType;
    ParkingSlotStatus parkingSlotStatus;
    Parking_Floor parkingFloor;

    public Parking_slot(String id, Vehicle_type vehicleType, ParkingSlotStatus parkingSlotStatus, Parking_Floor parkingFloor) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.parkingSlotStatus = parkingSlotStatus;
        this.parkingFloor = parkingFloor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vehicle_type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle_type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public Parking_Floor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(Parking_Floor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
