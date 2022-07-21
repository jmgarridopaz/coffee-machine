package io.github.jmgarridopaz.coffeemachine.application;

public class DrinkMaker implements ForPlacingOrders {

    private final ForObtainingRecipes recipeProvider;
    private final ForDispensing dispenser;

    public DrinkMaker ( ForObtainingRecipes recipeProvider, ForDispensing dispenser ) {
        this.recipeProvider = recipeProvider;
        this.dispenser = dispenser;
    }

    @Override
    public void makeDrink ( Drink drink ) {
        Recipe recipe = this.recipeProvider.getRecipe ( drink );
        for ( Ingredient ingredient : recipe.ingredients() ) {
            dispenser.dispense ( ingredient, recipe.quantity(ingredient) );
        }
    }

}
