package org.example.Entity;

import java.util.List;

public class Parking_Floor {
    String id;
    List<Parking_slot> parkingSlots;


    public Parking_Floor(String id, List<Parking_slot> parkingSlots) {
        this.id = id;
        this.parkingSlots = parkingSlots;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Parking_slot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<Parking_slot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }
}
