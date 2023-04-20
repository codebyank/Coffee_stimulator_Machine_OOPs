package services;

import enums.Ingredients;
import interfaces.IIngredientFiller;

public class IngredientsAdderService implements IIngredientFiller {
    IngredientsFillerService fillerService;
    public IngredientsAdderService() {
        fillerService=IngredientsFillerService.getInstance();
    }

    @Override
    public void fill(Ingredients type, float quantity) {
           fillerService.setIngredientQuantity(type,quantity);
    }
}
