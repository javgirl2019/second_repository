package pl.advanced_programming.comparing;

import java.util.List;

public class PersonComparator implements Comparable <PersonComparator> {

    private String name;
    private String surname;
    private int age;

    public PersonComparator(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonComparator{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(PersonComparator o) {
        return this.age-o.age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
