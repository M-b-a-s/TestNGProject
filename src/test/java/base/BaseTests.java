package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;


public class BaseTests {
    WebDriver driver = new ChromeDriver();
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        // open website
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
