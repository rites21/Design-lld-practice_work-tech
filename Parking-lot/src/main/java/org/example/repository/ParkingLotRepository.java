package org.example.repository;

import com.sun.source.tree.BreakTree;
import org.example.Entity.Parking_Lot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotRepository {
    static Map<String, Parking_Lot> parkingLotRepositoryMap;

    static List<Parking_Lot> parkingLotList;

    public ParkingLotRepository(){
        parkingLotRepositoryMap = new HashMap<>();
        parkingLotList = new ArrayList<>();
    }
    public static  List<Parking_Lot> getParkingLotList(){
        return parkingLotList;
    }

    public static Map<String,Parking_Lot> getParkingLotRepositoryMap(){
        return parkingLotRepositoryMap;
    }
    public Parking_Lot findById(String id){
        return  parkingLotRepositoryMap.get(id);
    }
    public Parking_Lot save(Parking_Lot parkingLot){
        return parkingLotRepositoryMap.put(parkingLot.getId(),parkingLot);
    }

}
