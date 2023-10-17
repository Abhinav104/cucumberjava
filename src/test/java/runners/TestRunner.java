package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src\\test\\resources\\Features",
    glue = "StepDef",
    tags="@smoke",
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
    }
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
