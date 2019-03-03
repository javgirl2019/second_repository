package pl.advanced_programming.comparing;

import pl.advanced_programming.comparing.ref_method.CompareByModel;
import pl.advanced_programming.comparing.ref_method.ComparingByThreeThings;

import java.time.Year;
import java.util.*;

public class ExampleComparator {

    public static void main(String[] args) {
        List<PersonComparator> person = Arrays.asList(
                new PersonComparator("Mariusz", "P", 20),
                new PersonComparator("Karolina", "L", 35),
                new PersonComparator("Zoska", "D", 85)
        );
        Collections.sort(person);

        Collections.sort(person, ((o1, o2) -> o1.getName().compareTo(o2.getName())));
        Collections.sort(person, Comparator.comparing(PersonComparator::getSurname).
                thenComparing(PersonComparator::getName));


        List<Auto> autoList = Arrays.asList(
                new Auto("BMW", "red", "X6", 2.0f, Year.of(2018)),
                new Auto("Toyota", "white", "Corolla", 2.0f, Year.of(2005)),
                new Auto("Mini", "black", "One", 1.6f, Year.of(2007)),
                new Auto("Honda", "green", "Prius", 1.6f, Year.of(2016)),
                new Auto("Suzuki", "yellow", "Swift", 1.4f, Year.of(2002)),
                new Auto("Suzuki", "green", "Swift", 1.4f, Year.of(2002)),
                new Auto("Mini", "yellow", "Cooper", 1.4f, Year.of(2005))
        );

        Collections.sort(autoList);
        System.out.println(autoList);

//        Auto carToCompare = new Auto("Ford", "black", "Focus",1.6f, Year.of(2018));
//        carToCompare.maybeComparing(Auto o)->1;

        System.out.println("After sorting by colour");
        Collections.sort(autoList, new CarBrandComparator());
        System.out.println(autoList);

        autoList.sort(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return 0;
            }
        });

        autoList.sort((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));

        CompareByModel anotherModelComparingWay = new CompareByModel();

        autoList.sort((car1, car2) -> {
            return
                    anotherModelComparingWay.orderByModel(car1, car2);
        });

//        autoList.sort((car1, car2) -> anotherModelComparingWay.orderByModel(car1, car2));
//        autoList.sort(anotherModelComparingWay::orderByModel);

        autoList.sort((o1, o2) -> CompareByModel.orderByModel(o1, o2));
        autoList.sort(CompareByModel::orderByModel);
        System.out.println(autoList);

        autoList.sort((o1, o2) -> ComparingByThreeThings.result(o1, o2));
        autoList.sort(ComparingByThreeThings::result);
        System.out.println(autoList);

        autoList.sort(Comparator.comparing(Auto::getModel)
                .thenComparing(Auto::getBrand)
                .thenComparing(Auto::getColor)
                .thenComparing(Auto::getYearOfProduction));
        System.out.println(autoList);
    }

}