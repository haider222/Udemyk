package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;


public class MyStepdefs extends BaseClassForAll {
    PageObjectPattern pageObjectPattern;

    public MyStepdefs() {
         pageObjectPattern = new PageObjectPattern(driver);
    }

    @Given("^as I user i am on correct web page$")
    public void asIUserIAmOnCorrectWebPage() throws Throwable {
        initalizaDriver();
        driver.get(openURL());

    }

    @When("^click on login button$")
    public void clickOnLoginButton() throws Throwable {
     //  pageObjectPattern = new PageObjectPattern(driver);
        WebElement loginButton = pageObjectPattern.loginbuttonclick();
        loginButton.click();
    }


    @Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterAnd(String value1, String value2) throws Throwable {
        pageObjectPattern.usernames().sendKeys(value1);
        pageObjectPattern.passwords().sendKeys(value2);
    }

    @Then("^users enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void usersEnterAnd(String value1, String value2) throws Throwable {
        pageObjectPattern.usernames().sendKeys(value1);
        pageObjectPattern.passwords().sendKeys(value2);
    }
}
