import io.cucumber.java.en.And;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@CucumberOptions(tags = "@Sanity",features = {"src/test/java/features"},
//@CucumberOptions(tags = "@SmokeTest or @RegressionTest",features = {"src/test/java/features"},
@CucumberOptions(tags = "",features = {"src/test/java/features"},
                glue = "stepDefinition",
        plugin = {"pretty","html:target/htmlreports.html"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
