package pl.advanced_programming.comparing.ref_method;

import pl.advanced_programming.comparing.Auto;

public class CompareByModel {

    public static int orderByModel (Auto first, Auto second) {
        return
            first.getModel().compareTo(second.getModel());
    }
}
