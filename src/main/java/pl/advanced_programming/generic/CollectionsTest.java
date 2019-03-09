package pl.advanced_programming.generic;

import pl.advanced_programming.abstract_class.Animal;
import pl.advanced_programming.abstract_class.Cat;
import pl.advanced_programming.abstract_class.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {


        List <Animal> someList = new ArrayList<>();
            someList.add(new Dog ("Azor"));
            someList.add(new Cat("Fifi"));


        List <Dog> dogs = Arrays.asList(
                new Dog("Azor"),
                new Dog ("Pimpek")
        );

        List <Cat> cats = Arrays.asList(
                new Cat("Fifi"),
                new Cat ("Mruczuś")
        );

//        displayAnimal(cats);
    }

    public static void displayAnimal (List <Animal> animals) {
        for (Animal animal: animals) {
            System.out.println(animals);
        }
    }

//    public static void addAnimal (List <? extends Animal> animals) {
//        animals.add(new Dog("Azor"));
//    }
}
