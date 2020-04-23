package createApparatTest;

import org.junit.Test;
import pages.LoginPage;
import parentTests.AbstractParentTest;

import java.io.IOException;

import static libs.ConfigClass.getCfgValue;

public class CreateApparatWithNumberCommentFilled extends AbstractParentTest {

    @Test
    public void CreateApparatWithNumberCommentFilled() throws IOException {
        LoginPage loginPage = new LoginPage(this.webDriver);
        loginPage.openPageLogin();
        loginPage.inputLogin(getCfgValue("USER_NAME"));
        loginPage.inputPassword(getCfgValue("PASSWORD"));
        loginPage.clickSubmitButton();
        homePage.clickOnSubmenu();
        homePage.clickOnSubmenuApparat();

        apparatPage.clickAddButton();

        apparatPage.inputApparatNumber(getCfgValue("NUMBER"));
        apparatPage.inputApparatComment(getCfgValue("APPARAT_COMMENT"));
        apparatPage.clickCreateButton();

        checkExpectedResult("Table is not displayed", apparatPage.isTableDisplayed());


    }

}
