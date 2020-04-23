package editProfileTest;

import libs.ConfigClass;
import libs.SpreadsheetData;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.LoginPage;
import pages.ProfilePage;
import parentPage.ParentPage;
import parentTests.AbstractParentTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import static libs.ConfigClass.getCfgValue;
@RunWith(Parameterized.class)
public class CheckEditedEmailFieldAfterReload extends AbstractParentTest {
    private String email;

    public CheckEditedEmailFieldAfterReload(String email) {
        this.email = email;
    }

    @Parameterized.Parameters(name = "Parameters are {0}")
    public static Collection testData() throws IOException {

        InputStream spreadsheet
                = new FileInputStream(ConfigClass.getCfgValue("DATA_FILE_PATH")
                +"testEmailData.xls");
        return new SpreadsheetData(spreadsheet, "emailValid").getData();
    }
    @Test
public void checkEditEmailAfterRefreshPage() throws IOException {
        ProfilePage profilePage = new ProfilePage(this.webDriver);
        LoginPage loginPage = new LoginPage(this.webDriver);
        loginPage.openPageLogin();
        loginPage.inputLogin(getCfgValue("USER_NAME"));
        loginPage.inputPassword(getCfgValue("PASSWORD"));
        loginPage.clickSubmitButton();
        homePage.clickOnUser();
        homePage.clickProfileButton();
        profilePage.inputEmail(email);
        profilePage.clickSaveButton();
        profilePage.refreshPage();

        checkExpectedResult("Email is wrong" , profilePage.compareText(email));

    }


}
