package pl.advanced_programming.generic.exercise;

public class Cars extends Vehicle {

    private String colour;

    public Cars(String name, String wayOfMoving) {
        super(name, wayOfMoving);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "colour='" + colour + '\'' + super.toString() +
                '}';
    }
}
