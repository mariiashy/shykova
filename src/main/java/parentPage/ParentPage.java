package parentPage;

import libs.ActionWithWebElements;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import libs.ActionWithWebElements;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.apache.log4j.BasicConfigurator;
//import java.util.Properties;

public class ParentPage {
    protected WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());
    protected ActionWithWebElements actionsWithOurElements;

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
        actionsWithOurElements = new ActionWithWebElements(webDriver);

//    protected WebDriver webDriver;
//
//    protected Logger logger = Logger.getLogger(getClass());
//    protected ActionWithWebElements actionsElements;
//
//
//
//
//
//    Properties props = new Properties();
//        props.load(new FileInputStream("src/log4j.properties"));
//        PropertyConfigurator.configure(props);
//
//    public ParentPage(WebDriver webDriver){
//        this.webDriver = webDriver;
//        PageFactory.initElements(webDriver, this);
//        actionsElements = new ActionWithWebElements();
    }
}