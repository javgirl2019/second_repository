package pl.advanced_programming.null_handling_Optional;

import java.util.Optional;

public class Chipset {

    private String name;

    public Chipset(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    @Override
    public String toString() {
        return "Chipset{" +
                "name='" + name + '\'' +
                '}';
    }
}
