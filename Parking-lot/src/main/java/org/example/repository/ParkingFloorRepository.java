package org.example.repository;

import org.example.Entity.Parking_Floor;
import org.example.Entity.Parking_Lot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    static Map<String, Parking_Floor> parkingFloorMap;
    public ParkingFloorRepository(){
        parkingFloorMap = new HashMap<>();
    }

    public Parking_Floor findById(String id){
        return parkingFloorMap.get(id);
    }

    public  Parking_Floor save(Parking_Floor parkingFloor){
        return  parkingFloorMap.put(parkingFloor.getId(),parkingFloor);
    }
}
