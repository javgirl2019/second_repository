package pl.advanced_programming.comparing;

import java.util.*;

public class ExampleComparator {

    public static void main(String[] args) {
    List <PersonComparator> person = Arrays.asList(
            new PersonComparator("Mariusz", "P", 20),
            new PersonComparator("Karolina", "L", 35),
            new PersonComparator("Zoska", "D", 85)
    );
        Collections.sort(person);

        Collections.sort(person, ((o1, o2) -> o1.getName().compareTo(o2.getName())));
        Collections.sort(person, Comparator.comparing(PersonComparator::getSurname).
                thenComparing(PersonComparator::getName));

    }
}