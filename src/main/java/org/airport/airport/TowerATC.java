package org.airport.airport;
import org.airport.hangar.AirplaneHangar;
import org.airport.planes.Plane;
import org.airport.utils.Randomizer;


public class TowerATC {

    public void simulateAirport(Airport airport, AirplaneHangar hangar){
        if(Randomizer.randomInt() % 2 == 0){
            departureProcedure(airport,hangar);
        }
        else if (Randomizer.randomInt() % 3 == 0) {
            arrivalProcdeure(airport,hangar);
        }
    }

    public void departureProcedure(Airport airport, AirplaneHangar hangar){
            Plane plane = hangar.getPlane();
            if(hangar.checkPlane(plane)) {
                airport.addDeparture(plane,Randomizer.randomRelation(),Randomizer.randomTime());
            }
            else{
                hangar.repairPlane(plane);
            }
    }
    public void arrivalProcdeure(Airport airport, AirplaneHangar hangar){
        Plane plane = Randomizer.randomPlane();
        airport.addArrival(plane,Randomizer.randomRelation(),Randomizer.randomTime());
        hangar.addPlane(plane);
    }

}
