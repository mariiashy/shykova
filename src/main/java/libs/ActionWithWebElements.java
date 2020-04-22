package libs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionWithWebElements {
    WebDriver webDriver;
  Logger logger = Logger.getLogger(ActionWithWebElements.class);
   WebDriverWait webDriverWait_10, webDriverWait_15, webDriverWait_5;

    public ActionWithWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait_10 = new WebDriverWait(webDriver, 10);
        webDriverWait_15 = new WebDriverWait(webDriver, 15);
        webDriverWait_5 = new WebDriverWait(webDriver, 5);
    }


    public void enterTextToTextFields(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
            logger.info("");
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("");
        }
    }

    public void clickButton(WebElement element) {
        try {
            element.click();
            logger.info("");

        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("");
        }
    }


    public boolean isElementDisplayed(WebElement element) {
        try {
            webDriverWait_15.until(ExpectedConditions.visibilityOf(element));
            element.click();

            return element.isDisplayed();
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("");
            return false;
        }
    }

    public void setCheckBox(WebElement element, boolean state) {
        try {
            if (element.isSelected() != state){
                element.click();

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("");
            return;
        }
    }

    public void selectElementFromDD(WebElement element, String itemName) {
        Select dropDownValue = new Select(element);
        try {
            dropDownValue.selectByVisibleText(itemName);
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("");
        }
    }

    public void refreshPage(WebElement element){

        try {
            webDriverWait_5.until(ExpectedConditions.visibilityOf(element));
            webDriver.navigate().refresh();
        }
        catch (Exception ex){
            ex.printStackTrace();
            logger.error("");
        }
    }

    public String getText(WebElement element){

        try {
            return  element.getText();

        }
        catch (Exception ex){
            ex.printStackTrace();
            logger.error("");
            return "";
        }
    }

    public String getInputValue(WebElement element){

        try {
            return element.getAttribute("value");
        }
        catch (Exception ex){
            ex.printStackTrace();
            logger.error("");
            return "";
        }
    }


}
