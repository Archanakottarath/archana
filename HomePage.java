package com.aa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By flightStatusTab = By.id("jq-flightStatus");
    By flightCheckinTab = By.id("jq-myTripsCheckIn");

    public void selectflightStatusTab() {

        driver.findElement(flightStatusTab).click();
    }

    public void selectflightCheckinTab() {

        driver.findElement(flightCheckinTab);
    }
}