package services;

import interfaces.ICoffeeStrategy;

import java.util.Objects;

public class CoffeeContext {
    private ICoffeeStrategy coffeeStrategy;

    void setStrategy(String coffeeType) {
        if(Objects.equals(coffeeType, "Latte")) {
            coffeeStrategy = new LatteService();
        } else if (Objects.equals(coffeeType, "Cappicino")) {
            coffeeStrategy = new CappiccinoService();
        } else {
            coffeeStrategy = new ExpressoService();
        }
    }

    void buy() {
        coffeeStrategy.createCoffee();
    }
}
