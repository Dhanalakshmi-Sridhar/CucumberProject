package StepDefinition;
import io.cucumber.java.en.*;
import org.example.Pages.Page1;
import org.example.browser.com.Browser;
import org.testng.Assert;  // include testng assert rather than junit
import org.testng.Reporter;
import screenshot.Screenshot1;

public class Test1
{
    @Given("User opens the Browser")
    public void user_opens_the_browser()
    {
        Browser.Intialization();
    }
    @Then("User Enters the {string}")
    public void user_enters_the(String string)
    {
        Browser.Setup(string);
    }
    @And("User verifies the Title of the Application")
    public void user_verifies_the_title_of_the_application()
    {
        try
        {
            Thread.sleep(3000);
            Screenshot1.ScreenShot("Title");
           Assert.assertEquals("Smartbazaar - World of Asian Foods", Page1.getTitle());
           Reporter.log("Pass");
        }
        catch(AssertionError e)
        {
            System.out.println(e);
            Reporter.log(e.getMessage());
            Reporter.log("Fail");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Then("User closes the Browser")
    public void user_closes_the_browser()
    {
        Browser.Close();
    }

}
