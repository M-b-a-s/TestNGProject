package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    WebDriver driver;
    By inputField = By.id("target");
    By resulText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResult() {
        return driver.findElement(resulText).getText();
    }
}
