package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.StepDefinition;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="E:\\Unify Testing\\2.Automation Testing\\3.BDD_Framework\\Tesco\\src\\test\\resources\\Features",
        glue = {"StepDefination"},
        dryRun = false

)

public class TestRunner {
}
