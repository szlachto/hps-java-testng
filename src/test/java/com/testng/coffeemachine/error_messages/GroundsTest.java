package com.testng.coffeemachine.error_messages;

import org.testng.annotations.*;
import com.testng.coffeemachine.Actionwords;

public class GroundsTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();

        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // And I handle everything except the grounds
        actionwords.iHandleEverythingExceptTheGrounds();
    }

    @Test
    public void messageEmptyGroundsIsDisplayedAfter30CoffeesAreTaken() {
        // When I take "30" coffees
        actionwords.iTakeCoffeeNumberCoffees(30);
        // Then message "Empty grounds" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Empty grounds");
    }

    @Test
    public void whenTheGroundsAreEmptiedMessageIsRemoved() {
        // Given I take "30" coffees
        actionwords.iTakeCoffeeNumberCoffees(30);
        // When I empty the coffee grounds
        actionwords.iEmptyTheCoffeeGrounds();
        // Then message "Ready" should be displayed
        actionwords.messageMessageShouldBeDisplayed("Ready");
    }
}