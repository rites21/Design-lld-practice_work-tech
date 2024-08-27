package org.example.repository;

import org.example.Entity.Parking_Floor;
import org.example.Entity.Parking_slot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSlotRepository {
    static Map<String, Parking_slot> parkingSlotMap;
    public ParkingSlotRepository(){
        parkingSlotMap = new HashMap<>();
    }

    public Parking_slot findById(String id){
        return parkingSlotMap.get(id);
    }

    public  Parking_slot save(Parking_slot parkingSlot){
        return  parkingSlotMap.put(parkingSlot.getId(),parkingSlot);
    }
}
