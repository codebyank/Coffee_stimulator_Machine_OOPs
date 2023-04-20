package services;

import enums.Ingredients;

import java.util.HashMap;
import java.util.Map;

public class IngredientsFillerService  {
    private static IngredientsFillerService instance;

    private Map<Ingredients, Float> ingredient_quantity = new HashMap<>();

    private IngredientsFillerService() {
        ingredient_quantity.put(Ingredients.Water, 0.0f);
        ingredient_quantity.put(Ingredients.Beans, 0.0f);
        ingredient_quantity.put(Ingredients.Milk, 0.0f);
    }

    public static IngredientsFillerService getInstance() {
        if(instance == null) {
            instance = new IngredientsFillerService();
        }
        return instance;
    }

    public void setIngredientQuantity(Ingredients ingredient, float quantity) {
        ingredient_quantity.put(ingredient, ingredient_quantity.get(ingredient) + quantity);
    }

    public void reduceIngredientQuantity(Ingredients ingredient, float quantity) {
        ingredient_quantity.put(ingredient, ingredient_quantity.get(ingredient) - quantity);
    }

    public float getIngredientQuantity(Ingredients ingredient) {
        return ingredient_quantity.get(ingredient);
    }

}
