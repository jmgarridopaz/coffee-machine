package io.github.jmgarridopaz.coffeemachine.application;

public class DrinkMaker implements ForPlacingOrders {

    private ForObtainingRecipes recipeProvider;
    private ForDispensing dispenser;

    public DrinkMaker ( ForObtainingRecipes recipeProvider, ForDispensing dispenser ) {
        this.recipeProvider = recipeProvider;
        this.dispenser = dispenser;
    }

    public DrinkMaker() {
    }

    @Override
    public void makeDrink ( Drink drink ) {
        Recipe recipe = this.recipeProvider.getRecipe ( drink );
        for ( Ingredient ingredient : recipe.ingredients() ) {
            dispenser.dispense ( ingredient, recipe.quantity(ingredient) );
        }
    }

    public void configure ( ForObtainingRecipes recipeProvider, ForDispensing dispenser) {
        this.recipeProvider = recipeProvider;
        this.dispenser = dispenser;
    }

    public boolean checkConsistency() {
        // TODO check consistency ?
        return true;
    }
}
