package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by adennis on 3/12/2018.
 */
public class Hooks {

    public static WebDriver driver;
    @Before
    public void InitializeTest () {
        java.lang.String browser = System.getProperty("BROWSER");
        if (browser == null) {
            browser = System.getenv("BROWSER");
            if (browser == null) {
                browser = "chrome";
            }
        }
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--test-type --illegal-access=warn");
            driver = new ChromeDriver(options);

        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--test-type");
            driver = new FirefoxDriver();
        } else if (browser.equals("phantomjs")) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\SeleniumDrivers\\phantomjs.exe");
            driver = new PhantomJSDriver(caps);
        }

        System.out.println("Opening Browser " + browser);
        driver.manage().deleteAllCookies();
    }

    @After

    public void TeatDownTest(Scenario scenario)
    {
        if(scenario.isFailed())
        try
        {
           scenario.write("Current page URL is " + driver.getCurrentUrl());
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        System.out.println("Closing Browser");
        driver.quit();
        }
    }

