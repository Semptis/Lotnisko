package org.airport.hangar;
import org.airport.exception.*;
import org.airport.planes.Plane;

public class PlaneMechanic {

    public boolean checkPlane(Plane plane) throws EngineException, FuelException, OxygenException {
        try{
            if(checkFuel(plane) && checkEngine(plane) && checkOxygen(plane)){
                return true;
            }
        }
        catch (FuelException | EngineException | OxygenException e){
            System.err.println(e.getMessage() + " in " + e.getClass());
            return false;
        }
        return false;
    }

    public Plane reapirPlane(Plane plane){
        plane.setFuelStatus(true);
        plane.setEngineStatus(true);
        plane.setOxygenStatus(true);
        return plane;
    }
    private boolean checkFuel(Plane plane) {
        if (!plane.getFuelStatus()) {
            throw new FuelException();
        }
        return true;
    }
    private boolean checkEngine(Plane plane) {
        if (!plane.getEngineStatus()) {
            throw new EngineException();
        }
        return true;
    }
    private boolean checkOxygen(Plane plane) {
        if (!plane.getOxygenStatus()) {
            throw new OxygenException();
        }
        return true;
    }
}
