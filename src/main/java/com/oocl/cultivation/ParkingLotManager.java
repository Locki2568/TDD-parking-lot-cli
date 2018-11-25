package com.oocl.cultivation;

import java.io.CharArrayReader;
import java.util.ArrayList;

public class ParkingLotManager extends ParkingBoy{
    ArrayList<ParkingBoy> parkingBoys;

    public ParkingLotManager(ArrayList<ParkingLot> parkingLots, ArrayList<ParkingBoy> parkingBoys){
        super(parkingLots);
        this.parkingBoys = parkingBoys;
    }

    public ParkingTicket toldParkingBoyToPark(ParkingBoy parkingBoy, Car car){
        return parkingBoy.park(car);
    }

    public Car toldParkingBoyToFetchCar(ParkingBoy parkingBoy, ParkingTicket parkingTicket){
        return parkingBoy.fetch(parkingTicket);
    }
}
