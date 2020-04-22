package loginTests;

import org.junit.Test;
import pages.LoginPage;
import parentTests.AbstractParentTest;

public class LoginWithPageObjectTest extends AbstractParentTest {

    @Test
    public void validLogin(){
        LoginPage loginPage = new LoginPage(this.webDriver);
        loginPage.openPageLogin();
        loginPage.inputLogin("Student");
        loginPage.inputPassword("909090");
        loginPage.clickSubmitButton();
        checkExpectedResult("Avatar is not present", homePage.isAvatarDisplayed());
    }
}
