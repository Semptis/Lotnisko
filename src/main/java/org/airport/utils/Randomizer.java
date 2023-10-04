package org.airport.utils;
import org.airport.planes.MilitaryPlane;
import org.airport.planes.PassengerPlane;
import org.airport.planes.Plane;
import org.airport.planes.TouristPlane;
import java.util.Random;
import java.time.LocalTime;

public abstract class Randomizer {
    private static final Random RAND = new Random();
    private static final String[] RELATION = {
            "Warszawa - Londyn",
            "Kraków - Berlin",
            "Poznań - Paryż",
            "Wrocław - Rzym",
            "Gdańsk - Barcelona"
    };

    private static final String[] CLASS = {
            "MilitaryPlane",
            "PassengerPlane",
            "TouristPlane"
    };

    private static final String[][] MODELS = {
            {"Boeing 747", "Airbus A320", "Boeing 777", "Airbus A380", "Boeing 737"},
            {"Lockheed C-130 Hercules", "Airbus A400M Atlas", "Boeing C-17 Globemaster III", "Ił-76", "Antonov An-124"},
            {"F-16 Fighting Falcon", "Su-27", "MiG-29", "F-22 Raptor", "Eurofighter Typhoon"}
    };

    public static String randomRelation() {
        int indeks = RAND.nextInt(RELATION.length);
        return RELATION[indeks];
    }

    public static LocalTime randomTime() {
        int hour = RAND.nextInt(24);
        int minute = RAND.nextInt(60);
        return LocalTime.of(hour, minute);
    }

    public static Plane randomPlane() {
        int indeks = RAND.nextInt(CLASS.length);
        String chooseClass = CLASS[indeks];
        String model = MODELS[indeks][RAND.nextInt(5)];
        switch (chooseClass){
            case "MilitaryPlane":
                return new MilitaryPlane(model,RAND.nextBoolean(),RAND.nextBoolean(),RAND.nextBoolean());
            case "PassengerPlane":
                return new PassengerPlane(model,RAND.nextBoolean(),RAND.nextBoolean(),RAND.nextBoolean());
            case "TouristPlane":
                return new TouristPlane(model,RAND.nextBoolean(),RAND.nextBoolean(),RAND.nextBoolean());
            default:
                return null;
        }
    }

    public static int randomInt() {
        return RAND.nextInt(100000);
    }
}
