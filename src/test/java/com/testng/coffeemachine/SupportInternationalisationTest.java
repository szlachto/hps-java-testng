package com.testng.coffeemachine;

import org.testng.annotations.*;

public class SupportInternationalisationTest {
    // Tags: sprint:3
    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    public void messagesAreBasedOnLanguage(String readyMessage, String language) {
        // Tags: priority:medium
        // When I start the coffee machine using language "<language>"
        actionwords.iStartTheCoffeeMachineUsingLanguageLang(language);
        // Then message "<ready_message>" should be displayed
        actionwords.messageMessageShouldBeDisplayed(readyMessage);
    }

    @Test
    public void messagesAreBasedOnLanguageEnglish() {
        messagesAreBasedOnLanguage("Ready", "en");
    }

    @Test
    public void messagesAreBasedOnLanguageFrench() {
        messagesAreBasedOnLanguage("Pret", "fr");
    }


    //
    // Tags: priority:medium
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