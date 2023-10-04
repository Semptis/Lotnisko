package org.airport.hangar;
import org.airport.planes.Plane;
import org.airport.utils.Randomizer;

import java.util.LinkedList;

public class AirplaneHangar  {
    private LinkedList<Plane> availablePlanes;
    private PlaneMechanic mechanic;
    public AirplaneHangar(){
        availablePlanes = new LinkedList<>();
        for(int i=0; i<10; i++){
            availablePlanes.add(Randomizer.randomPlane());
        }
        mechanic = new PlaneMechanic();
    }

    public void addPlane(Plane plane){
        availablePlanes.add(plane);
    }

    public Plane getPlane(){
        return availablePlanes.removeFirst();
    }

    public int getAirplaneCount(){
        return availablePlanes.size();
    }

    public boolean checkPlane(Plane plane){
        return mechanic.checkPlane(plane);
    }
    public void repairPlane(Plane plane){
        mechanic.reapirPlane(plane);
        addPlane(plane);
    }
    public void showAvailablePlaneInHangar(){
        for(Plane plane: availablePlanes){
            System.out.println(plane);
        }
    }

}
