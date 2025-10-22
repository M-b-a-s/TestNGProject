package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    By inputField = By.id("file-upload");
    By uploadBtn = By.id("file-submit");
    By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadBtn() {
        driver.findElement(uploadBtn).click();
    }

    public void uploadFile(String absPathOfFile) {
        driver.findElement(inputField).sendKeys(absPathOfFile);
        clickUploadBtn();
    }

    public String getUploadedFiles() {
        return driver.findElement(uploadedFiles).getText();
    }
}
