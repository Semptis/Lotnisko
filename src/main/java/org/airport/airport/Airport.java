package org.airport.airport;
import org.airport.planes.IPlane;
import java.time.LocalTime;
import java.util.LinkedList;

public class Airport <T extends IPlane> {
    private LinkedList<FlightDetail <T>> departures;
    private LinkedList<FlightDetail <T>> arrivals;
    public Airport()
    {
        this.departures = new LinkedList<>();
        this.arrivals = new LinkedList<>();
    }
    public void addDeparture(T plane, String relation, LocalTime departureTime) {
        departures.add(new FlightDetail<>(plane, relation, departureTime));
        if(departures.size() >= 5){
            departures.removeLast();
        }
    }

    public void addArrival(T plane, String relation, LocalTime arrivalTime) {
        arrivals.add(new FlightDetail<>(plane, relation, arrivalTime));
        if(arrivals.size() >= 5){
            arrivals.removeLast();
        }
    }

    public void showDepartures() {
        for (FlightDetail<T> detail : departures) {
            System.out.println("Departures: " + detail);
        }
    }

    public void showArrivals() {
        for (FlightDetail<T> detail : arrivals) {
            System.out.println("Arrivals: " + detail);
        }
    }
}
