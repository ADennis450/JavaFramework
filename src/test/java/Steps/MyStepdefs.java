package Steps;

import PageObjects.GoogleSearchPage;
import com.sun.istack.internal.Nullable;
import com.sun.xml.internal.ws.api.model.ExceptionType;
import org.junit.Test;
import org.junit.Assert;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import javax.management.RuntimeErrorException;
import java.util.HashMap;
import java.util.List;

import static okhttp3.internal.Util.equal;

/**
 * Created by adennis on 3/12/2018.
 */

public class MyStepdefs{

    public WebDriver driver;
    public GoogleSearchPage google = new GoogleSearchPage(driver);

    public MyStepdefs () {
      driver = Hooks.driver;
      PageFactory.initElements(driver, GoogleSearchPage.class);
    }

    @Given("^Navigate to \"([^\"]*)\"$")
    public void navigateTo(String url){
      driver.navigate().to(url);
    }

    @And("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String url)
    {
        google.searchFor(url);
    }

    @And("^I press enter in the search field$")
    public void iPressEnterInTheSearchField()
    {
        google.enter();
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String linkName)
    {
        google.clickLink(linkName);
    }

    @Then("^I should be on the \"([^\"]*)\" page$")
    public void iShouldBeOnThePage(String page)
    {
        String expectedValue = page;
        String title = driver.getTitle();

    }


}
