package io.github.jmgarridopaz.coffeemachine.adapter.forobtainingrecipes.testdouble;

import io.github.jmgarridopaz.coffeemachine.application.Drink;
import io.github.jmgarridopaz.coffeemachine.application.ForObtainingRecipes;
import io.github.jmgarridopaz.coffeemachine.application.Ingredient;
import io.github.jmgarridopaz.coffeemachine.application.Recipe;
import org.testng.TestNG;
import org.testng.xml.XmlPackage;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * DRIVEN ADAPTER
 */
public class InMemoryRecipeProvider implements ForObtainingRecipes {

    @Override
    public Recipe getRecipe ( Drink drink ) {
        Recipe recipeOfDrink = new Recipe();
        switch ( drink ) {
            case SHORT_ESPRESSO:
                recipeOfDrink.addIngredientWithQuantity ( Ingredient.COFFEE,5 );
                recipeOfDrink.addIngredientWithQuantity ( Ingredient.WATER,3 );
                break;
            case LONG_ESPRESSO:
                recipeOfDrink.addIngredientWithQuantity ( Ingredient.COFFEE,5 );
                recipeOfDrink.addIngredientWithQuantity ( Ingredient.WATER,6 );
                break;
            default:
        }
        return recipeOfDrink;
    }
}
