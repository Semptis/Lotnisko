package org.airport.airport;
import org.airport.planes.IPlane;
import java.time.LocalTime;

public class FlightDetail<T extends IPlane> {
    private T plane;
    private String relation;
    private LocalTime departureTime;

    public FlightDetail(T plane, String relation, LocalTime departureTime) {
        this.plane = plane;
        this.relation = relation;
        this.departureTime = departureTime;
    }
    @Override
    public String toString() {
        return "FlightDetail{" +
                "plane=" + plane.getModel() +
                ", relation='" + relation + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }
}





