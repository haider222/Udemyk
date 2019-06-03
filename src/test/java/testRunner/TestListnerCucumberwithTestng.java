package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/ScenarioOutline.feature",
        glue = "stepdefs"
)
public class TestListnerCucumberwithTestng extends AbstractTestNGCucumberTests {
}
