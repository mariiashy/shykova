package pages;
import libs.ActionWithWebElements;
import libs.ConfigClass;
import org.junit.Assert;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {

    @FindBy(name = "_username")
    private WebElement inputLoginName;

    @FindBy(name = "_password")
    private WebElement inputLoginPassword;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement inputButtonXpath;

// String url = "http://v3.test.itpmgroup.com/login";

    @FindBy(xpath = ".//div[@class='login-box-body']")
    private WebElement loginBox;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPageLogin() {
        try {
            webDriver.get(ConfigClass.getCfgValue("base_url"));
            logger.info("Login page was opened");
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("Cannot open file");
            Assert.fail("Cannot open file");
        }
    }

    public void inputLogin(String name) {
        actionsWithOurElements.enterTextToTextFields(inputLoginName, name);

    }

    public void inputPassword(String text) {
        actionsWithOurElements.enterTextToTextFields(inputLoginPassword, text);
    }

    public void clickSubmitButton() {
        actionsWithOurElements.clickButton(inputButtonXpath);
    }

    public boolean isLoginBoxRefreshed() {
        return  actionsWithOurElements.isElementDisplayed(loginBox);
    }

    public void loginToPage(String login, String password) {
        inputLogin(login);
        inputPassword(password);
        clickSubmitButton();
    }
    public boolean isLoginFieldDisplayed() {
       return actionsWithOurElements.isElementDisplayed(inputLoginName);
    }
}

////package pages;
//////
//
//////import libs.ConfigClass;
//////import org.openqa.selenium.WebDriver;
//////import org.apache.html.ulit.Asserts;
//////import org.apache.log4j.Logger;
//////import org.openqa.selenium.WebElement;
//////import org.openqa.selenium.By;
//////
//////import org.openqa.selenium.support.FindBy;
//////import parentPage.ParentPage;
//
//package pages;
//
//import libs.ActionWithWebElements;
//import libs.ConfigClass;
//import org.apache.http.util.Asserts;
//import org.apache.log4j.Logger;
////import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import parentPage.ParentPage;
//import sun.jvm.hotspot.utilities.Assert;
//
//public class LoginPage extends ParentPage {
//    protected WebDriver webDriver;
//    protected Logger logger = Logger.getLogger(getClass());
//    protected ActionWithWebElements actionWithWebElements;
//    //By inputLoginName = By.name("_username");
//    @FindBy(name = "_username")
//            private WebElement inputLoginName;
//    //By inputPasswordName = By.name("_password");
//
//    @FindBy(name = "_password")
//            private WebElement InputPasswordName
//    //By inputButtonXpath = By.xpath(".//button[@type = 'submit']");
//    @FindBy(xpath = ".//button[@type = 'submit']")
//    private WebElement InputButtonXpath;
//
//    //String url = "http://v3.test.itpmgroup.com/";
//    @FindBy(xpath = ".//div[@class='login-box-body']")
//    private WebElement loginBox;
//
//    public LoginPage(WebDriver webDriver){
//        super(webDriver);
////        this.webDriver = webDriver;
////        actionWithWebElements = new ActionWithWebElements(webDriver);
//
//    }
//
//    public void openPage(){
//        try{
//           webDriver.get(url);
//        }
//
//        catch (Exception e){
//            e.printStackTrace();
//
//        }
//    }
//    public void openPageLogin() {
//        try {
//            webDriver.get(ConfigClass.getCfgValue("base_url"+"/login");
//            logger.info("Login page was opened");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            logger.error("Cannot open file");
//            Assert.fail("Cannot open file");
//        }
//    }
//    public void inputLogin(String text){
//        actionWithWebElements.enterTextToTextField(inputLoginName, text);
//    }
//
//    public void inputPassword(String text){
//        actionWithWebElements.enterTextToTextField(inputPasswordName, text);
//    }
//
////    public void clickElement(){
////        actionWithWebElements.clickButton(inputButtonXpath);
////    }
//
//    public void clickSubmitButton(){
//    actionWithWebElements.clickButton(inputButtonXpath);
//    }
//
//    public void loginToPage(String login, String pass){
//        inputLogin(login);
//        inputPassword(pass);
//        clickSubmitButton();
//    }
//
//}
