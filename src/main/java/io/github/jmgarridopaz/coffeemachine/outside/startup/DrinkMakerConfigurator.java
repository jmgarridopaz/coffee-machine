package io.github.jmgarridopaz.coffeemachine.outside.startup;

import io.github.jmgarridopaz.coffeemachine.application.DrinkMaker;
import io.github.jmgarridopaz.coffeemachine.application.ForDispensing;
import io.github.jmgarridopaz.coffeemachine.application.ForObtainingRecipes;

public class DrinkMakerConfigurator {

    public static boolean configureDrinkMaker ( DrinkMaker drinkMaker, ForObtainingRecipes recipes, ForDispensing dispensers ) {
        drinkMaker.configure ( recipes, dispensers );
        boolean successCheck = drinkMaker.checkConsistency();
        return successCheck;
    }

}