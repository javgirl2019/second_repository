package pl.advanced_programming.null_handling_Optional;

import java.util.Optional;

public class Computer {

    private GraphicsCard graphicsCard;

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicsCard=" + graphicsCard +
                '}';
    }

    public Optional<GraphicsCard> getGraphicsCard() {
        return Optional.ofNullable(graphicsCard);
    }
}
