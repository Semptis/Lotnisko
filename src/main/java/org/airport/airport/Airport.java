package org.airport.airport;
import org.airport.planes.IPlane;
import java.time.LocalTime;
import java.util.ArrayList;

public class Airport <T extends IPlane> {
    private ArrayList<FlightDetail <T>> departures;
    private ArrayList<FlightDetail <T>> arrivals;
    public Airport()
    {
        this.departures = new ArrayList<>();
        this.arrivals = new ArrayList<>();
    }
    public void addDepartures(T plane, String relation, LocalTime departureTime) {
        departures.add(new FlightDetail<>(plane, relation, departureTime));
    }

    public void addArrivals(T plane, String relation, LocalTime arrivalTime) {
        arrivals.add(new FlightDetail<>(plane, relation, arrivalTime));
    }

    public void showDepartures() {
        for (FlightDetail<T> detail : departures) {
            System.out.println(detail);
        }
    }
}
