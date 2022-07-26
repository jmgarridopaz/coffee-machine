package io.github.jmgarridopaz.coffeemachine.outside.driver.forplacingorders.testcases;

import io.github.jmgarridopaz.coffeemachine.application.DrinkMaker;
import io.github.jmgarridopaz.coffeemachine.application.ForPlacingOrders;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * DRIVER (primary actor)
 *
 * Program that tests the behaviour offered by "for placing orders" port.
 * It calls the application port directly.
 * Doesn't need any adapter.
 * It uses TestNG framework.
 */
public class TestDriver {

    private static final String REPORTS_DIRECTORY = System.getProperty("user.home") + File.separator + ".coffeemachine" + File.separator + "testreports";

    public static ForPlacingOrders drinkMaker;

    public TestDriver ( ForPlacingOrders drinkMake ) {
        drinkMaker = drinkMaker;
    }

    public void run() {

        // Run TestNG with a XML virtual file
        XmlSuite suite = new XmlSuite();
        suite.setName("CoffeMachine_TestSuite");

        XmlTest test = new XmlTest(suite);
        test.setName("CoffeeMachine_Test");

        List<XmlClass> testClasses = new ArrayList<XmlClass>();
        testClasses.add ( new XmlClass(io.github.jmgarridopaz.coffeemachine.driver.forplacingorders.testcases.TestDrinkMaker.class) );
        test.setClasses(testClasses);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);

        TestNG testng = new TestNG();

        testng.setXmlSuites(suites);

        testng.setOutputDirectory (REPORTS_DIRECTORY);

        System.out.println();
        System.out.println("=====");
        System.out.println("Reports will be generated in the following output directory:");
        System.out.println( testng.getOutputDirectory() );
        System.out.println("=====");
        System.out.println();

        testng.run();
    }

}
