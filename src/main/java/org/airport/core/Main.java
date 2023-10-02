package org.airport.core;
import org.airport.airport.Airport;
import org.airport.airport.TowerATC;
import org.airport.planes.*;


public class Main {
    public static void main(String[] args) {
        Plane plane = new MilitaryPlane("Airbus",true, true, true);
        TowerATC towerATC = new TowerATC();
        Airport airport = new Airport();
        towerATC.departureProcedure(plane,airport);
        airport.showDepartures();


        }
    }
