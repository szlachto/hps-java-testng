package com.testng.coffeemachine.display_errors;

import org.testng.annotations.*;
import com.testng.coffeemachine.Actionwords;

public class WaterTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();

        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // And I handle everything except the water tank
        actionwords.iHandleEverythingExceptTheWaterTank();
    }
    //
    // Tags: priority:high
    @Test
    public void whenTheWaterTankIsFilledTheMessageDisappears() {
        // When I take "55" coffees
        actionwords.iTakeCoffeeNumberCoffees(55);
        // And I fill the water tank
        actionwords.iFillTheWaterTank();
        // Then message "Ready" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Ready");
    }
    //
    // Tags: priority:low
    @Test
    public void itIsPossibleToTake10CoffeesAfterTheMessageFillWaterTankIsDisplayed() {
        // When I take "60" coffees
        actionwords.iTakeCoffeeNumberCoffees(60);
        // Then coffee should be served
        actionwords.coffeeShouldBeServed();
        // When I take a coffee
        actionwords.iTakeACoffee();
        // Then coffee should not be served
        actionwords.coffeeShouldNotBeServed();
    }
    //
    // Tags: priority:high
    @Test
    public void messageFillWaterTankIsDisplayedAfter50CoffeesAreTaken() {
        // When I take "50" coffees
        actionwords.iTakeCoffeeNumberCoffees(50);
        // Then message "Fill tank" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Fill tank");
    }
}