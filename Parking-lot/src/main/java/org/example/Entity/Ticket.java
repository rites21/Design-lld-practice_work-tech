package org.example.Entity;

public class Ticket {
    String id;
    Parking_slot parkingSlot;
    Vehicle vehicle;

    public Ticket(String id, Parking_slot parkingSlot, Vehicle vehicle) {
        this.id = id;
        this.parkingSlot = parkingSlot;
        this.vehicle = vehicle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Parking_slot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(Parking_slot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
