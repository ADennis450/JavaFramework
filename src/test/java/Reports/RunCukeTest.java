package Reports;

/**
 * Created by adennis on 3/13/2018.
 */
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Features",
        glue = "MyStepdefs",
        plugin = {"pretty", "html:target/cucumber-html-report"}
        )
public class RunCukeTest {
}
