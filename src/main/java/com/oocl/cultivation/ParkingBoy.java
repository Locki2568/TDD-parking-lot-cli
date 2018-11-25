package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
        int availablePos = parkingLot.getAvailableParkingPosition();
        if (availablePos > 0) {
            return this.parkingLot.storeCar(car);
        }else{
            lastErrorMessage = "";
            return null;
        }
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
        return this.parkingLot.pickCar(ticket);
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
