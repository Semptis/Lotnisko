package org.airport.planes;


public interface IPlane {
    String getModel();
    boolean getFuelStatus();
    boolean getEngineStatus();
    boolean getOxygenStatus();
    void setFuelStatus(boolean fuel);
    void setEngineStatus(boolean engine);
    void setOxygenStatus(boolean oxygen);
}
