package stepdefs;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectPattern {
    private static Logger logger = LogManager.getLogger(PageObjectPattern.class.getName());
    WebDriver driver;

    public PageObjectPattern(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='pull-right']/ul/li[4]/a/span")
    WebElement loginButton  ;
    public WebElement loginbuttonclick() {
        return loginButton;
    }


    @FindBy(xpath ="//input[@id = 'user_email']")
    WebElement username;
    public WebElement usernames(){
        return username;
    }


    @FindBy(xpath ="//input[@id = 'user_password']")
    WebElement password;
    public WebElement passwords(){
        return password;
    }

    @FindBy(xpath = "//*[@class ='text-center']")
    WebElement textVerify;
    public WebElement getTextVerify(){
        return textVerify;
    }
}


