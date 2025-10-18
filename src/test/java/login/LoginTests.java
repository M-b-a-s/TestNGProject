package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfullLogin() {
        LoginPage loginPage = homePage.clickFormAuth();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickLoginBtn();
        assertTrue(securePage.getAlertText().contains( "You logged into a secure area!"), "Alert text is incorrect");

    }
}
