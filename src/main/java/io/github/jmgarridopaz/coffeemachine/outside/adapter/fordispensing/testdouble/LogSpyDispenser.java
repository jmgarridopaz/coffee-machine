package io.github.jmgarridopaz.coffeemachine.outside.adapter.fordispensing.testdouble;

import io.github.jmgarridopaz.coffeemachine.application.*;

import java.util.HashMap;
import java.util.Map;

/**
 * DRIVEN ADAPTER
 */
public class LogSpyDispenser implements ForDispensing {

    private Map<Ingredient,Integer> quantitiesDispensedByIngredient;

    public LogSpyDispenser() {
        this.quantitiesDispensedByIngredient = new HashMap<Ingredient,Integer>();
    }

    @Override
    public void dispense ( Ingredient ingredient, int quantity ) {
        this.quantitiesDispensedByIngredient.put(ingredient,quantity);
    }

    @Override
    public int quantityOf(Ingredient ingredient) {
        return this.quantitiesDispensedByIngredient.get(ingredient);
    }

}
