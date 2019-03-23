package pl.advanced_programming.optional;

import java.util.Objects;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        doSomething("Ala ma kota");
        doSomething(null);
    }
    public static void doSomething (String isNullOrNot) {
        Objects.requireNonNull(isNullOrNot); //od razu zlapanie wyjatku aby juz na poczatku zalozyc zebysmy nigdy nie dostali nulla
        Optional.ofNullable(isNullOrNot);  //kiedy przewidujemy że moze byc null
        Optional.of(isNullOrNot);   //tutaj nikt nam nie moze przeslac nulla, jesli tak sie stanie to od razu wywali wyjatek
    }
}
