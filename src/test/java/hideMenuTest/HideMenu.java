package hideMenuTest;

import org.junit.Test;
import pages.LoginPage;
import parentTests.AbstractParentTest;

import java.io.IOException;

import static libs.ConfigClass.getCfgValue;

public class HideMenu extends AbstractParentTest {
    @Test
    public void HideMenu() throws IOException {

        LoginPage loginPage = new LoginPage(this.webDriver);
        loginPage.openPageLogin();
        loginPage.inputLogin(getCfgValue("USER_NAME"));
        loginPage.inputPassword(getCfgValue("PASSWORD"));
        loginPage.clickSubmitButton();
        homePage.clickMenu();

        checkExpectedResult("Menu is not hidden", homePage.isBodyWithHiddenMenuDisplaed());


    }
}
