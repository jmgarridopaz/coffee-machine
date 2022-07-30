package io.github.jmgarridopaz.coffeemachine.outside.startup;

import io.github.jmgarridopaz.coffeemachine.application.DrinkMaker;
import io.github.jmgarridopaz.coffeemachine.application.ForDispensing;
import io.github.jmgarridopaz.coffeemachine.application.ForObtainingRecipes;
import io.github.jmgarridopaz.coffeemachine.outside.adapter.fordispensing.testdouble.LogSpyDispenser;
import io.github.jmgarridopaz.coffeemachine.outside.adapter.forobtainingrecipes.testdouble.InMemoryRecipeProvider;
import io.github.jmgarridopaz.coffeemachine.outside.driver.forplacingorders.testcases.TestDriver;

/**
 * ENTRY POINT
 */
public class DrinkMakerMain {

    public static void main ( String[] args ) {

        // Select adapters for every driven port
        ForObtainingRecipes recipes = new InMemoryRecipeProvider();
        ForDispensing dispensers = new LogSpyDispenser();
        DrinkMaker drinkMaker = new DrinkMaker();

        // Configure the app (do the wiring)
        DrinkMakerConfigurator.configureDrinkMaker ( drinkMaker, recipes, dispensers );

        // Pass the app to the driver
        TestDriver testDriver = new TestDriver(drinkMaker);

        // Run the driver
        testDriver.run();

    }

}
