package pl.advanced_programming.generic;

import pl.advanced_programming.abstract_class.Animal;
import pl.advanced_programming.abstract_class.Cat;
import pl.advanced_programming.abstract_class.Dog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SecretExample {

    public static void main(String[] args) {
        MyStringSecret dream = new MyStringSecret("hahaha");
        MyBigDecimalSecret incoms = new MyBigDecimalSecret(BigDecimal.ZERO);

        MySecretGenericV1 integer = new MySecretGenericV1(java.lang.Integer.valueOf(1));
        MySecretGenericV1 anotherDream = new MySecretGenericV1("aaahahahah");

        Integer secretInteger = (Integer) integer.getObject();

        checkMySecret(integer);
        checkMySecret(anotherDream);

        List animals = new ArrayList();
        animals.add(new Dog("Azor"));
        animals.add(new Cat("Fifi"));
        checkAnimal(animals);

        MySecondGeneric <String> stringSecret = new MySecondGeneric<>("secret");
        MySecondGeneric <BigDecimal> futureIncome = new MySecondGeneric<>(BigDecimal.valueOf(1_000_000));
        MySecondGeneric objectSecret = new MySecondGeneric<>(new Object());
    }

    public static void checkAnimal (List animals) {
        for (Object animal: animals) {
            if (animal instanceof Dog) {
                System.out.println("Dog");
            } else if (animal instanceof Cat) {
                System.out.println("Cat");
            } else {

            }
        }
    }

    public static void checkMySecret (MySecretGenericV1 secretGenericV1) {

        if (secretGenericV1.getObject() instanceof Integer) {
            Integer secret = (Integer) secretGenericV1.getObject();
            System.out.println("Secret" + secret);
        }
    }
}
