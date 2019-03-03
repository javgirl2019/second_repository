package pl.advanced_programming.comparing.ref_method;

import pl.advanced_programming.comparing.Auto;

public class ComparingByThreeThings {

   public static int result(Auto o1, Auto o2) {
        if (o1.getBrand().equals(o2.getBrand())) {
            if (o1.getModel().equals(o2.getModel())) {
                if (o1.getYearOfProduction().equals(o2.getYearOfProduction())) {
                    return 0;
                } else return o1.getYearOfProduction().compareTo(o2.getYearOfProduction());
            } else return o1.getModel().compareTo(o2.getModel());
        } else return o1.getBrand().compareTo(o2.getBrand());
    }
}
