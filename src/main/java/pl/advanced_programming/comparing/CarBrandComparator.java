package pl.advanced_programming.comparing;

import java.util.Comparator;

public class CarBrandComparator implements Comparator <Auto> {

    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
