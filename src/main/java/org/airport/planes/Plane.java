package org.airport.planes;
import org.airport.exception.*;

public abstract class Plane implements IPlane{
    protected String model;
    protected boolean fuel;
    protected boolean engine;
    protected boolean oxygen;

    Plane(String model, boolean fuel, boolean engine, boolean oxygen){
        this.model = model;
        this.fuel = fuel;
        this.engine = engine;
        this.oxygen = oxygen;
    }

    public boolean start() throws EngineException, FuelException, OxygenException{
        try{
            if(checkFuel() && checkEngine() && checkOxygen()){
                return true;
            }
        }
        catch (FuelException | EngineException | OxygenException e){
            System.err.println(getClass() + " " + e.getMessage());
            return false;
        }
        return false;
    }
    public String getModel(){
        return this.model;
    }

    protected boolean checkFuel() {
        if (!this.fuel) {
            throw new FuelException();
        }
        return true;
    }
    protected boolean checkEngine() {
        if (!this.engine) {
            throw new EngineException();
        }
        return true;
    }
    protected boolean checkOxygen() {
        if (!this.oxygen) {
            throw new OxygenException();
        }
        return true;
    }

}
