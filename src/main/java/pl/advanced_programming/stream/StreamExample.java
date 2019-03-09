package pl.advanced_programming.stream;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {


        List <Item> saturdayItem = Arrays.asList(
                new Item ("bigMAc", BigDecimal.valueOf(20.00), Arrays.asList(new Ingredient("paper"))),

                new Item("chlebek", BigDecimal.valueOf(15.00),
                        Arrays.asList(new Ingredient("sugar"), new Ingredient("H2O"))

                ));

        Order saturdayShopping = new Order(saturdayItem);
        List<Item> sundayItem = Arrays.asList(
                new Item("Cola", BigDecimal.valueOf(30.00), Arrays.asList(new Ingredient ("e52"), new Ingredient ("pluton")))
        );

        Order sundayShopping = new Order(sundayItem);

        getIngredientName(Arrays.asList(sundayShopping, saturdayShopping));
    }

    public static List <String> getIngredientName(List<Order> orders) {

        return orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .flatMap(item -> item.getIngredientsList().stream())
                .map(ingredient -> ingredient.getName())
                .distinct()
                .collect(Collectors.toList());
    }

//    public static List <String> getIngredientNameWithReduce (List<Order> orders) {
//
//        return orders.stream()
//                .flatMap(order -> order.getMyItems().stream())
//                .flatMap(item -> item.getIngredientsList().stream())
//                .map(ingredient -> ingredient.getName())
//                .distinct()
//                .reduce(ArrayList<String> result,( ArrayList<String>, );
//        ))
//
//        return Collections.emptyList();
//    }
    public static BigDecimal sumMyItems (List < Order > orders) {
            return
                    orders.stream()
                            .flatMap(order -> order.getMyItems().stream())
                            .map(item -> item.getPrice())
                            .reduce(BigDecimal.ZERO, ((bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2)));
        }
    }




