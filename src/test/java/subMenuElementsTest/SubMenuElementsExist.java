package subMenuElementsTest;

import org.junit.Test;
import pages.LoginPage;
import parentTests.AbstractParentTest;

import java.io.IOException;

import static libs.ConfigClass.getCfgValue;

public class SubMenuElementsExist extends AbstractParentTest {
    @Test
    public void SubMenuElementsExist() throws IOException {
        LoginPage loginPage = new LoginPage(this.webDriver);
        loginPage.openPageLogin();
        loginPage.inputLogin(getCfgValue("USER_NAME"));
        loginPage.inputPassword(getCfgValue("PASSWORD"));
        loginPage.clickSubmitButton();
        homePage.clickOnSubmenu();

        homePage.isSubMenuApparatDisplayed();
        checkExpectedResult("Apparat does not exists", homePage.isSubMenuApparatDisplayed());
        homePage.isSubMenuSpareDisplayed();
        checkExpectedResult("Spare does not exists", homePage.isSubMenuSpareDisplayed());
        homePage.isSubMenuSpareTypeDisplayed();
        checkExpectedResult("Spare Type does not exists", homePage.isSubMenuSpareTypeDisplayed());
        homePage.isSubMenuTransactionSideDisplayed();
        checkExpectedResult("Transaction Side does not exists", homePage.isSubMenuTransactionSideDisplayed());
        homePage.isSubMenuWorkerDisplayed();
        checkExpectedResult("Worker does not exists", homePage.isSubMenuWorkerDisplayed());
        homePage.isSubMenuTransactionTypeDisplayed();
        checkExpectedResult("Transaction Type does not exists", homePage.isSubMenuTransactionTypeDisplayed());

    }
}
