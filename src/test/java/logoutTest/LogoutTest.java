package logoutTest;

import libs.ConfigClass;
import org.junit.Test;
import pages.LoginPage;
import parentTests.AbstractParentTest;

import java.io.IOException;

public class LogoutTest extends AbstractParentTest {

    @Test
    public void logOut() throws IOException {
        LoginPage loginPage = new LoginPage(this.webDriver);
        loginPage.openPageLogin();
        loginPage.inputLogin(ConfigClass.getCfgValue("USER_NAME"));
        loginPage.inputPassword(ConfigClass.getCfgValue("PASSWORD"));
        loginPage.clickSubmitButton();
        homePage.clickOnUser();
        homePage.clickLogOut();

        checkExpectedResult("There is not login page", loginPage.isLoginFieldDisplayed());
    }
}
