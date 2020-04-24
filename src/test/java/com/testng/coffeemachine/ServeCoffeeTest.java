package com.testng.coffeemachine;

import org.testng.annotations.*;

public class ServeCoffeeTest {
    // Tags: sprint:1
    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    // Well, sometimes, you just get a coffee.
    // Tags: priority:high
    @Test
    public void simpleUse() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // When I take a coffee
        actionwords.iTakeACoffee();
        // Then coffee should be served
        actionwords.coffeeShouldBeServed();
    }
}