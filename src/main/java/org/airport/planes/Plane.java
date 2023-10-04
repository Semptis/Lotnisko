package org.airport.planes;

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

    public String getModel(){
        return this.model;
    }

    public boolean getFuelStatus(){
        return this.fuel;
    }

    public boolean getEngineStatus(){
        return this.engine;
    }
    public boolean getOxygenStatus(){
        return this.oxygen;
    }

    public void setFuelStatus(boolean fuel){
        this.fuel = fuel;
    }

    public void setEngineStatus(boolean engine){
        this.engine = engine;
    }

    public void setOxygenStatus(boolean oxygen){
        this.oxygen = oxygen;
    }
}
