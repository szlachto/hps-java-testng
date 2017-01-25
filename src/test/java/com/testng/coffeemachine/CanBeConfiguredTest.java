package com.testng.coffeemachine;

import org.testng.annotations.*;

public class CanBeConfiguredTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void displaySettings() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // When I switch to settings mode
        actionwords.iSwitchToSettingsMode();
        // Then displayed message is:
        actionwords.displayedMessageIs("Settings:\n - 1: water hardness\n - 2: grinder");
    }

    @Test
    public void defaultSettings() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // When I switch to settings mode
        actionwords.iSwitchToSettingsMode();
        // Then settings should be: "| water hardness | 2      |
        // | grinder        | medium |"
        actionwords.settingsShouldBe("| water hardness | 2      |\n| grinder        | medium |");
    }
}