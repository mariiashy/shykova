package loginTests;


import libs.ConfigClass;
import libs.ExcelDriver;
import org.junit.After;
import org.junit.Test;
import parentTests.AbstractParentTest;


import java.io.IOException;
import java.util.Map;

public class LoginTestWithPageObjectWithExcel extends AbstractParentTest {
    @Test
    public void validLogin() throws IOException {
        Map<String, String> dataForValidLogin = ExcelDriver.getData(ConfigClass.getCfgValue("DATA_FILE"), "validLogOn");

        loginPage.openPageLogin();
        loginPage.inputLogin(dataForValidLogin.get("login"));
        loginPage.inputPassword(dataForValidLogin.get("pass"));
        loginPage.clickSubmitButton();

        checkExpectedResult("Avatar is not present", homePage.isAvatarDisplayed());
    }

//    @After
//    public void tearDown(){
//    }


}


//package loginTests;
//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import libs.ConfigClass;
//import libs.ExcelDriver;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pages.LoginPage;
//import parentTests.AbstractParentTest;
//
//
//import java.io.IOException;
//import java.util.Map;
//
//public class LoginTestWithPageObjectWithExcel extends AbstractParentTest {
//
//    private WebDriver webdriver = driverInit();
//
//    private WebDriver driverInit() {
//
//        WebDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }
//    @Test
//    public void validLogin() throws IOException {
//        //WebDriver webDriver;
//        Map<String, String> dataForValidLogin = ExcelDriver.getData(ConfigClass.getCfgValue("DATA_FILE"), "validLogOn");
//
//        LoginPage loginPage = new LoginPage(webdriver);
//        loginPage.openPageLogin();
//        loginPage.inputLogin(dataForValidLogin.get("login"));
//        loginPage.inputPassword(dataForValidLogin.get("pass"));
//        loginPage.clickSubmitButton();
//
//        checkExpectedResult("Avatar is not present", homePage.isAvatarDisplayed());
//    }
//
//
//
//}
