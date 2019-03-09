package pl.advanced_programming.generic;

import java.math.BigDecimal;

public class ClassWithGenericMethod {

    private  String maybeName;
    private Double maybeIncome;
    private BigDecimal hugeNumber;


    public ClassWithGenericMethod(String maybeName, Double maybeIncome, BigDecimal hugeNumber) {
        this.maybeName = validateString(maybeName);
        this.maybeIncome = validateDobule(maybeIncome);
        this.hugeNumber = validateT(hugeNumber);

        validateT(hugeNumber);
    }

    private String validateString (String toCheck) {
        if (toCheck == null) {
            throw new RuntimeException("Cannot be null");
        }
        return toCheck;
    }

    private Double validateDobule(Double toCheck) {
        if (toCheck == null) {
            throw new RuntimeException("Cannot be null");
        }
        return toCheck;
    }

    private <T> T validateT(T toCheck) {
        if (toCheck == null) {
            throw new RuntimeException("brrrr");
        }
        return toCheck;
    }

}
