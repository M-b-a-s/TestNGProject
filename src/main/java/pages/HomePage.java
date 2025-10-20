package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuth() {
        clickLink("Form Authentication");

        return new LoginPage(driver);
    }

    public DropdownPage clickDroopDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
