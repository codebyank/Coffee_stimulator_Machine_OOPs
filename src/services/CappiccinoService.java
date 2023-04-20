package services;

import interfaces.ICoffeeStrategy;

public class CappiccinoService implements ICoffeeStrategy {
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
