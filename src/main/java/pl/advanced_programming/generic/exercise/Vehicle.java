package pl.advanced_programming.generic.exercise;

public class Vehicle {

    private String name;
    private String wayOfMoving;

    public Vehicle(String name, String wayOfMoving) {
        this.name = name;
        this.wayOfMoving = wayOfMoving;
    }

    public String getName() {
        return name;
    }

    public String getWayOfMoving() {
        return wayOfMoving;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", wayOfMoving='" + wayOfMoving + '\'' +
                '}';
    }
}
