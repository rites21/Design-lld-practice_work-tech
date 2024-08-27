package org.example.Entity;

import java.util.List;

public class Parking_Lot {
    String id;
    List<Parking_Floor> parkingFloors;
    int noOfFloors;
    int noOfSlotsPerFloor;

    public Parking_Lot(String id, List<Parking_Floor> parkingFloors, int noOfFloors, int noOfSlotsPerFloor) {
        this.id = id;
        this.parkingFloors = parkingFloors;
        this.noOfFloors = noOfFloors;
        this.noOfSlotsPerFloor = noOfSlotsPerFloor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Parking_Floor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<Parking_Floor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public int getNoOfSlotsPerFloor() {
        return noOfSlotsPerFloor;
    }

    public void setNoOfSlotsPerFloor(int noOfSlotsPerFloor) {
        this.noOfSlotsPerFloor = noOfSlotsPerFloor;
    }
}
