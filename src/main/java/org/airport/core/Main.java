package org.airport.core;
import org.airport.airport.Airport;
import org.airport.airport.TowerATC;
import org.airport.hangar.AirplaneHangar;


public class Main {
    public static void main(String[] args) {
        AirplaneHangar hangar = new AirplaneHangar();
        TowerATC towerATC = new TowerATC();
        Airport airport = new Airport();
        while(true){
            towerATC.simulateAirport(airport,hangar);
            //hangar.showAvailablePlaneInHangar();
            airport.showDepartures();
            airport.showArrivals();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



        }
    }