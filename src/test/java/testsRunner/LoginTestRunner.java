package testsRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/pankaj.gup/Documents/Automation_Project/PankajFW/BDD_Framework/src/test/java/appFeatures"},
        glue = {"stepDefinitions"}
)
public class LoginTestRunner {

}
