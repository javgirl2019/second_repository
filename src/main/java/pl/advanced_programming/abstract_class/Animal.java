package pl.advanced_programming.abstract_class;

import java.util.Objects;

public abstract class Animal {

    private static final int NAME_MIN_LENGHT = 1;
    protected String name;

    public Animal(String name) {
        this.name = Objects.requireNonNull(name, "[name] cannot be null!!!");
        if (name.length() < NAME_MIN_LENGHT) {
            throw new RuntimeException("name is too short : [" + name + "], minimal lenght is: " + NAME_MIN_LENGHT);
        }
    }

    public abstract void eat ();

    public abstract void play ();


}
