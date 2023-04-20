package services;

import enums.Ingredients;
import interfaces.IIngredientFiller;

import java.util.Map;

public class CoffeeMachine {
    private IIngredientFiller ingredientFiller;

    private CoffeeContext coffeeContext;

    public CoffeeMachine() {
        ingredientFiller = new IngredientsAdderService();
        coffeeContext = new CoffeeContext();
    }

    void buyCoffee(String type) {
        coffeeContext.setStrategy(type);
        coffeeContext.buy();
    }

    void fillIngredients(Map<Ingredients, Float> ingredients) {
        for(Map.Entry<Ingredients, Float> entrySet : ingredients.entrySet()) {
            ingredientFiller.fill(entrySet.getKey(), entrySet.getValue());
        }
    }
}
