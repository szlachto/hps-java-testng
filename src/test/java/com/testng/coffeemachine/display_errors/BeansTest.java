package com.testng.coffeemachine.display_errors;

import org.testng.annotations.*;
import com.testng.coffeemachine.Actionwords;

public class BeansTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();

        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // And I handle everything except the beans
        actionwords.iHandleEverythingExceptTheBeans();
    }
    //
    // Tags: priority:high
    @Test
    public void afterAddingBeansTheMessageFillBeansDisappears() {
        // When I take "40" coffees
        actionwords.iTakeCoffeeNumberCoffees(40);
        // And I fill the beans tank
        actionwords.iFillTheBeansTank();
        // Then message "Ready" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Ready");
    }
    //
    // Tags: priority:low
    @Test
    public void itIsPossibleToTake40CoffeesBeforeThereIsReallyNoMoreBeans() {
        // When I take "40" coffees
        actionwords.iTakeCoffeeNumberCoffees(40);
        // Then coffee should be served
        actionwords.coffeeShouldBeServed();
        // When I take a coffee
        actionwords.iTakeACoffee();
        // Then coffee should not be served
        actionwords.coffeeShouldNotBeServed();
        // And message "Fill beans" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Fill beans");
    }
    //
    // Tags: priority:high
    @Test
    public void messageFillBeansIsDisplayedAfter38CoffeesAreTaken() {
        // When I take "38" coffees
        actionwords.iTakeCoffeeNumberCoffees(38);
        // Then message "Fill beans" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Fill beans");
    }
}