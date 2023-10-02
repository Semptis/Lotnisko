package org.airport.exception;

public class FuelException extends RuntimeException{
    public FuelException(){
        super("Out of fuel");
    }
}
