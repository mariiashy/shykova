package loginTests;


import io.github.bonigarcia.wdm.WebDriverManager;
import libs.ConfigClass;
import libs.SpreadsheetData;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import parentTests.AbstractParentTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;



@RunWith(Parameterized.class)
public class UnValidLoginTestWithPageObjectWithExcel extends AbstractParentTest {
//    private WebDriver webdriver = driverInit();
//
//    private WebDriver driverInit() {
//
//        WebDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }


    private String login, pass;

    public UnValidLoginTestWithPageObjectWithExcel(String login, String pass) {

        this.login = login;
        this.pass = pass;
    }

    @Parameterized.Parameters(name = "Parameters are {0} and {1}")
    public static Collection testData() throws IOException {

        InputStream spreadsheet
                = new FileInputStream(ConfigClass.getCfgValue("DATA_FILE_PATH")
                    +"testDataSuit.xls");
        return new SpreadsheetData(spreadsheet, "InvalidLogOn").getData();
    }

    @Test
    public void unvalidLogin() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.openPageLogin();
        loginPage.loginToPage(login, pass);

        checkExpectedResult("credentials are not wrong" , !loginPage.isLoginBoxRefreshed());
       // checkExpectedResult("Avatar should not be present" , !homePage.isAvatarDisplayed());
    }
//
//    @After
//    public void tearDown(){
//        webDriver.quit();
//    }


}
