package steps_definitions;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "steps_definitions",
        plugin = {"pretty",
                "json:target/reports/html-reports/TestRunner2.json"},
        tags = "@smoke_test"

)
public class TestRunner2  {

}
