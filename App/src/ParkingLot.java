package src;

import java.util.*;

public class ParkingLot {

    String[] spots;

    public ParkingLot(int size){
        spots = new String[size];
    }

    public void parkVehicle(String plate){

        int hash = Math.abs(plate.hashCode()) % spots.length;

        while(spots[hash] != null){
            hash = (hash + 1) % spots.length;
        }

        spots[hash] = plate;

        System.out.println("Vehicle parked at spot " + hash);
    }
}

