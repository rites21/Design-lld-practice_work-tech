package org.example.service;

import org.example.Entity.ParkingSlotStatus;
import org.example.Entity.Parking_Floor;
import org.example.Entity.Parking_slot;
import org.example.Entity.Vehicle_type;
import org.example.repository.ParkingFloorRepository;
import org.example.repository.ParkingLotRepository;
import org.example.repository.ParkingSlotRepository;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSlotRepository parkingSlotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository,ParkingFloorRepository parkingFloorRepository, ParkingSlotRepository parkingSlotRepository){
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSlotRepository = parkingSlotRepository;
    }
    public void createParkingLot(String parking_lot_id,int noOfFloors,int noOfSlotPerFloor){
        List<Parking_Floor> parkingFloors = new ArrayList<>(noOfFloors);
        for(int i = 0; i < noOfFloors; i++){
            Parking_Floor parkingFloor = new Parking_Floor(String.valueOf(i+1),)
            List<Parking_slot> parkingSlots = new ArrayList<>(noOfSlotPerFloor);
            for(int j = 0; j < noOfSlotPerFloor; j++){

                Parking_slot parkingSlot = new Parking_slot(String.valueOf(j+1), Vehicle_type.CAR, ParkingSlotStatus.EMPTY,String.valueOf(i+1));

                if(j == 0) {

                } else if (j == 1 || j == 2) {

                }else {

                }
            }
        }


    }
}
