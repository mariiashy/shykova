package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ApparatPage extends ParentPage {

    public ApparatPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[@class='btn btn-info btn-sm']")
    private WebElement addButton;

    @FindBy(name = "apparat[apparatNumber]")
    private WebElement inputApparatNumber;

    @FindBy(name = "apparat[apparatComment]")
    private WebElement inputApparatComment;

    @FindBy(name = "add")
    private WebElement createButton;

    @FindBy(xpath = ".//table[@id='device_list']")
    private WebElement table;


    public void clickAddButton(){actionsWithOurElements.clickButton(addButton);}

    public void inputApparatNumber(String name) {
        actionsWithOurElements.enterTextToTextFields(inputApparatNumber, name);

    }
    public void inputApparatComment(String name) {
        actionsWithOurElements.enterTextToTextFields(inputApparatComment, name);

    }

    public void clickCreateButton() {
        actionsWithOurElements.clickButton(createButton);
    }

    public boolean isInputApparatNumberDisplayed() {
        return actionsWithOurElements.isElementDisplayed(inputApparatNumber);
    }

    public boolean isTableDisplayed() {
        return actionsWithOurElements.isElementWithoutClickDisplayed(table);
}


}
