package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    WebDriver driver;
    By slider = By.xpath("//*[@id=\"content\"]/div/div/input");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSliderRight(int steps) {
        WebElement sliderElement = driver.findElement(slider);

        for (int i = 0; i < steps; i++) {
            sliderElement.sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
