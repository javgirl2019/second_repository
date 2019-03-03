package pl.advanced_programming.comparing;

import java.time.Year;

public class Auto implements Comparable <Auto> {

    private String brand;
    private String color;
    private String model;
    private float capacity;
    private Year yearOfProduction;


    public Auto(String brand, String color, String model, float capacity, Year yearOfProduction) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.capacity = capacity;
        this.yearOfProduction = yearOfProduction;
    }

    public void maybeComparing (Comparable<Auto> comparable) {
        System.out.println("inside maybeComparing()");
        System.out.println(comparable.compareTo(this));

    }


    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", yearOfProduction=" + yearOfProduction +
                '}' + '\n';
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public float getCapacity() {
        return capacity;
    }

    public Year getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public int compareTo(Auto o) {
        return this.yearOfProduction.compareTo(o.getYearOfProduction());
//        return this.getModel().compareTo(o.getModel());
    }
}
