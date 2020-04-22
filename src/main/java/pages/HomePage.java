//package pages;
//
//import org.openqa.selenium.WebDriver;
//import parentPage.ParentPage;

package pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

//public class HomePage extends ParentPage {
//
//    @FindBy(xpath = ".//li[@id='dictionary']//ul[@class='treeview-menu menu-open']//li[@id='prov_cus']")
//    private WebElement submenuProviders;
//
//     @FindBy(xpath = ".//*[@class='pull-left image']")
//    private WebElement avatar;
//
//    public HomePage(WebDriver webDriver) {
//        super(webDriver);
//    }
//    public boolean isAvatarDisplayed(){
//        //return actionsWithOurElements.isElementDisplay(avatar);
//        return actionsElements.isElementDisplayed(avatar);
//    }
//    public void checkIsAvatarPresent(){
//        Assert.assertTrue("avatar is not dis", isAvatarDisplayed());
//    }
//    public void clickOnSubmenuProviders(){
//        actionsElements.clickButton(submenuProviders);
//    }
//}

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//*[@class='pull-left image']")
    private WebElement avatar;

    @FindBy(xpath = ".//li[@id='dictionary']//ul[@class='treeview-menu menu-open']//li[@id='prov_cus']")
    private WebElement subMenuProvider;

    @FindBy(xpath = ".//li[@id='dictionary']")
    private WebElement subMenu;

//    @FindBy(xpath = ".//li[@id='dictionary']//ul[@class='treeview-menu menu-open']//li[@id='apparat']//a[@href='dictionary/apparat']")
//    private WebElement subMenuApparat;

    //li[@id='apparat']//a

//    @FindBy(xpath = ".//ul[@class='treeview-menu menu-open']//li[@id='apparat']")
//    private WebElement subMenuApparat;

    @FindBy(xpath = ".//li[@id='apparat']")
    private WebElement subMenuApparat;

    @FindBy(xpath = ".//li[@id='workers']")
    private WebElement subMenuWorker;

    @FindBy(xpath = ".//li[@id='spareType']")
    private WebElement subMenuSpareType;

    @FindBy(xpath = ".//li[@id='spares']")
    private WebElement subMenuSpare;

    @FindBy(xpath = ".//li[@id='prov_cus']")
    private WebElement subMenuTransactionSide;

    @FindBy(xpath = ".//li[@id='deal_type']")
    private WebElement subMenuTransactionType;

//@FindBy(xpath = ".//a[@href='dictionary/apparat']")
//private WebElement subMenuApparat;

    @FindBy(xpath = ".//*[@class='dropdown-toggle']")
    private WebElement dropdownProfile;

    @FindBy(xpath = ".//*[@class='pull-right']")
    private WebElement logOut;

    @FindBy(xpath = ".//body[@class='skin-blue sidebar-collapse']")
    private WebElement bodyWithHiddenMenu;

    @FindBy(xpath = ".//a[@class='sidebar-toggle']")
    private WebElement menuButton;

    @FindBy(xpath = ".//a[@class='btn btn-default btn-flat']")
    private WebElement profileButton;






    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(avatar);
    }

    public void checkIsAvatarPresent() {
        Assert.assertTrue("Avatar is not displayed", isAvatarDisplayed());
    }

    public void clickOnSubmenuProviders() {
        actionsWithOurElements.clickButton(subMenuProvider);
    }

    public void clickOnSubmenu() {
        actionsWithOurElements.clickButton(subMenu);
    }
    public void clickOnSubmenuApparat() {
        actionsWithOurElements.clickButton(subMenuApparat);
    }

    public void clickOnUser(){actionsWithOurElements.clickButton(dropdownProfile);}

    public void clickLogOut(){actionsWithOurElements.clickButton(logOut);}

    public boolean isSubMenuApparatDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subMenuApparat);
    }

    public boolean isSubMenuWorkerDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subMenuWorker);
    }

    public boolean isSubMenuSpareTypeDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subMenuSpareType);
    }

    public boolean isSubMenuSpareDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subMenuSpare);
    }

    public boolean isSubMenuTransactionSideDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subMenuTransactionSide);
    }

    public boolean isSubMenuTransactionTypeDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subMenuTransactionType);

    }
    public void clickMenu(){
        actionsWithOurElements.clickButton(menuButton);

    }
    public boolean isBodyWithHiddenMenuDisplaed(){
       return actionsWithOurElements.isElementDisplayed(bodyWithHiddenMenu);
    }

    public void clickProfileButton(){
        actionsWithOurElements.clickButton(profileButton);
    }



}
