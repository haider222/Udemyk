package testScenarios;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import stepdefs.BaseClassForAll;
import stepdefs.PageObjectPattern;

import java.io.IOException;

public class clickOnLoginButton extends BaseClassForAll {
    private static Logger logger = LogManager.getLogger(clickOnLoginButton.class.getName());
   @BeforeTest
    public void urlOpen() throws IOException {
       BasicConfigurator.configure();
        initalizaDriver();
       driver.get(openURL());

       }

    @Test
    public void clickOnlogin() throws InterruptedException, IOException {
        BasicConfigurator.configure();
        PageObjectPattern pageObjectPattern = new PageObjectPattern(driver);
        WebElement loginButton = pageObjectPattern.loginbuttonclick();
        loginButton.click();
    }
    @AfterClass
    public void CloseBrowser(){
        tearDown();
    }

}
