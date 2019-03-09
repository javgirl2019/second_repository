package pl.advanced_programming.generic.exercise;

public class Planes extends Vehicle {

    private String airlanes;

    public Planes(String name, String wayOfMoving) {
        super(name, wayOfMoving);
    }

    @Override
    public String toString() {
        return "Planes{" +
                "airlanes='" + airlanes + '\'' + super.toString() +
                '}';
    }
}
