package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ProfilePage extends ParentPage {

    @FindBy(xpath = ".//input[@id='userProfileEdit_user_email']")
    private WebElement emailField;

    @FindBy(xpath = ".//button[@name='save']")
    private WebElement saveButtin;

    public ProfilePage(WebDriver webDriver){
            super(webDriver);

    }

    public void refreshPage(){
        actionsWithOurElements.refreshPage(emailField);
    }

    public void inputEmail(String email) {
        actionsWithOurElements.enterTextToTextFields(emailField, email);

    }
    public boolean compareText(String email){
        return  (actionsWithOurElements.getInputValue(emailField).equals(email));
    }
    public void clickSaveButton(){
        actionsWithOurElements.clickButton(saveButtin);
    }
}
