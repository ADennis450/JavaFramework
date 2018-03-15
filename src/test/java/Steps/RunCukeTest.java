package Steps;
import Steps.MyStepdefs;

/**
 * Created by adennis on 3/13/2018.
 */
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"classpath:Features"},
        plugin = {"pretty", "html:target/cucumber-html-report"}
        )
public class RunCukeTest {
}
