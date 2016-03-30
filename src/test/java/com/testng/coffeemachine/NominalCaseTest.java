package com.testng.coffeemachine;

import org.testng.annotations.*;

public class NominalCaseTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    // Well, sometimes, you just get a coffee.
    @Test
    public void simpleUse() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // When I take a coffee
        actionwords.iTakeACoffee();
        // Then coffee should be served
        actionwords.coffeeShouldBeServed();
    }
    public void messagesAreBasedOnLanguage(String lang, String readyMessage) {
        // When I start the coffee machine "<lang>"
        actionwords.iStartTheCoffeeMachine(lang);
        // Then message "<ready_message>" should be displayed
        actionwords.messageMessageShouldBeDisplayed(readyMessage);
    }

    @Test
    public void messagesAreBasedOnLanguageEnglish() {
        messagesAreBasedOnLanguage("en", "Ready");
    }

    @Test
    public void messagesAreBasedOnLanguageFrench() {
        messagesAreBasedOnLanguage("fr", "Pret");
    }



    @Test
    public void noMessagesAreDisplayedWhenMachineIsShutDown() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // When I shutdown the coffee machine
        actionwords.iShutdownTheCoffeeMachine();
        // Then message "" should be displayed
        actionwords.messageMessageShouldBeDisplayed("");
    }
}