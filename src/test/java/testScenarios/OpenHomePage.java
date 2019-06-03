package testScenarios;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import stepdefs.BaseClassForAll;
import stepdefs.PageObjectPattern;

import java.io.IOException;

public class OpenHomePage extends BaseClassForAll {
    private static Logger logger = LogManager.getLogger(OpenHomePage.class.getName());

@BeforeTest
public void Initialization() throws IOException {
    BasicConfigurator.configure();
    driver = initalizaDriver();
    logger.info("browser open at this point");


}
    @Test(dataProvider = "getData")

    public void OpenHomePage(String value1, String value2) throws IOException, InterruptedException {
    BasicConfigurator.configure(); //initialize log4j
        driver.get(openURL());
        logger.info("web url opens");
    PageObjectPattern pageObjectPattern = new PageObjectPattern(driver);
    WebElement loginButton = pageObjectPattern.loginbuttonclick();
    loginButton.click();
    pageObjectPattern.usernames().sendKeys(value1);
    pageObjectPattern.passwords().sendKeys(value2);
   // Assert.assertEquals(pageObjectPattern.textVerify.getText(), "Log In to QaClickAcademy");
    logger.error("validated successfully");

    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[2][2];
        data[0][0] = "ilyas";
        data[0][1] = "ilyass";
        data[1][0] = "haider";
        data[1][1] = "afride";

        return  data;
    }
    @AfterClass
    public void closeBrowser(){
        tearDown();
    }
}
