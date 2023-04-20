package services;

import interfaces.ICoffeeStrategy;

public class CoffeeStrategyService implements ICoffeeStrategy {
    @Override
    public void createCoffee() {

    }

    @Override
    public boolean checkIngredient() {
        return false;
    }

    @Override
    public float getPrice() {
        return 0;
    }
}
