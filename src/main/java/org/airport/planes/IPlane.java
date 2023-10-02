package org.airport.planes;
import org.airport.exception.*;

public interface IPlane {
    boolean start() throws EngineException, FuelException, OxygenException;
    String getModel();
}
