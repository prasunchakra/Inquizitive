package com.inquizitive.steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSteps {
    private WebDriver driver;

    @Given("I am on the Google home page")
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void search(String query) {
        driver.findElement(By.name("q")).sendKeys(query + Keys.ENTER);
    }

    @Then("the result page title contains {string}")
    public void titleContains(String expected) {
        assertTrue(driver.getTitle().contains(expected));
        driver.quit();
    }
}
