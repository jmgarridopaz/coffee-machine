package io.github.jmgarridopaz.coffeemachine.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recipe {

    private Map<Ingredient,Integer> ingredientsWithQuantity;

    public Recipe() {
        this.ingredientsWithQuantity = new HashMap<Ingredient,Integer>();
    }

    public void addIngredientWithQuantity (Ingredient ingredient, int quantity ) {
        this.ingredientsWithQuantity.put(ingredient,quantity);
    }

    public List<Ingredient> ingredients() {
        List<Ingredient> ingredientsInRecipe = new ArrayList<Ingredient>();
        for ( Ingredient ingredient : Ingredient.values() ) {
            if ( this.ingredientsWithQuantity.containsKey(ingredient) && (this.ingredientsWithQuantity.get(ingredient) > 0) ) {
                ingredientsInRecipe.add(ingredient);
            }
        }
        return ingredientsInRecipe;
    }

    public int quantity ( Ingredient ingredient ) {
        return this.ingredientsWithQuantity.get(ingredient);
    }
}
