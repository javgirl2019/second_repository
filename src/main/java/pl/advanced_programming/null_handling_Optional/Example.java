package pl.advanced_programming.null_handling_Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Example {

    public static void main(String[] args) {
        List<Computer> computerList = new ArrayList<>();

        Computer fullOne = new Computer(new GraphicsCard(new Chipset("nVidia")));
        Computer withOutVendor = new Computer(new GraphicsCard(new Chipset(null)));
        Computer withOutChipset = new Computer(new GraphicsCard(null));
        Computer withOutGraphicsCard = new Computer(null);
        Computer maybeComputer = null;
        computerList.add(fullOne);
        computerList.add(withOutVendor);
        computerList.add(withOutChipset);
        computerList.add(withOutGraphicsCard);
        computerList.add(maybeComputer);

        computerList.forEach(arg -> System.out.println(getVendorNameJava8Way(arg)));

        Optional<String> maybeName = Optional.ofNullable(null);
        maybeName.ifPresent(s -> System.out.println(s));
        maybeName.ifPresent(System.out::println);

    }

    public static String getVendorNameJava8Way(Computer computer) {
         return Optional.ofNullable(computer)
                .flatMap(computer1 -> computer1.getGraphicsCard())
                .flatMap(graphicsCard -> graphicsCard.getChipset())
                .flatMap(chipset -> chipset.getName())
                 .orElseGet(() -> "brak");
    }


}
