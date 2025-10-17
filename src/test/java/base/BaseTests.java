package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    WebDriver driver = new ChromeDriver();

    public void setUp() {
        // open website
        driver.get("https://the-internet.herokuapp.com/");

        // maximize screen
        // driver.manage().window().maximize();

        // set size
        // driver.manage().window().setSize(new Dimension(412, 915));

        // locate an element
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();

        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();

        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElement.click();


        System.out.println(driver.getTitle());

        // close page
        // driver.quit();
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
