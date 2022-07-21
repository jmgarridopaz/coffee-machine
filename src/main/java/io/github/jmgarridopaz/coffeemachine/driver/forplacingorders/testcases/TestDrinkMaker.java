package io.github.jmgarridopaz.coffeemachine.driver.forplacingorders.testcases;

import io.github.jmgarridopaz.coffeemachine.adapter.fordispensing.testdouble.LogSpyDispenser;
import io.github.jmgarridopaz.coffeemachine.adapter.forobtainingrecipes.testdouble.InMemoryRecipeProvider;
import io.github.jmgarridopaz.coffeemachine.application.*;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class TestDrinkMaker {

    @Test
    public void testShortEspressoShouldDispense5CoffeAnd3Water() {
        ForObtainingRecipes recipeProvider = new InMemoryRecipeProvider();
        ForDispensing dispenser = new LogSpyDispenser();
        ForPlacingOrders drinkMaker = new DrinkMaker(recipeProvider,dispenser);
        drinkMaker.makeDrink(Drink.SHORT_ESPRESSO);
        Assert.assertEquals ( dispenser.quantityOf(Ingredient.COFFEE), 5 );
        Assert.assertEquals ( dispenser.quantityOf(Ingredient.WATER), 3 );
    }

    @Test
    public void testLongEspressoShouldDispense5CoffeAnd6Water() {
        ForObtainingRecipes recipeProvider = new InMemoryRecipeProvider();
        ForDispensing dispenser = new LogSpyDispenser();
        ForPlacingOrders drinkMaker = new DrinkMaker(recipeProvider,dispenser);
        drinkMaker.makeDrink(Drink.LONG_ESPRESSO);
        Assert.assertEquals ( dispenser.quantityOf(Ingredient.COFFEE), 5 );
        Assert.assertEquals ( dispenser.quantityOf(Ingredient.WATER), 6 );
    }

}
