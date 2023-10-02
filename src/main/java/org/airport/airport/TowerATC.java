package org.airport.airport;
import org.airport.planes.Plane;

import java.time.LocalTime;

public class TowerATC {

    public void departureProcedure(Plane plane, Airport airport){
        if(plane.start()) {
            airport.addDepartures(plane,"Warszawa - Londyn", LocalTime.of(10, 30));
        }
    }

    public void addArrival(Plane plane){

    }

}
