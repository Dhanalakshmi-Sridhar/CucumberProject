package StepDefinition;

import io.cucumber.java.en.*;
import org.example.Pages.*;
import org.testng.Assert;
import org.testng.Reporter;
import screenshot.Screenshot1;

public class Test2
{
    @Then("User enters the {string} data")
    public void user_enters_the_data(String string)
    {
        // Write code here that turns the phrase above into concrete actions
        Page1.Searchdata(string);
     }
    @When("User clicks on Search icon")
    public void user_clicks_on_search_icon()
    {
        Page1.clickon();
    }
    @When("User verifies the {string} results")
    public void user_verifies_the_results(String string)
    {
        try
        {
            Thread.sleep(3000);
            Screenshot1.ScreenShot(string);
            Assert.assertEquals(string,Page2.searchText());
            //Reporter.log("Pass");
        }
        catch(AssertionError e)
        {
            System.out.println(e);
            //Reporter.log(e.getMessage());
            //Reporter.log("Fail");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @Then("User selects the {string} from the list")
    public void user_selects_the_from_the_list(String string) throws Exception
    {
        Page2.productSelection(string);
    }
    @Then("User verifies the selected {string} result")
    public void user_verifies_the_selected_result(String string)
    {
        try
        {
            Thread.sleep(3000);
            Screenshot1.ScreenShot(string);
            Assert.assertEquals(string,Page3.searchPageNameVerify());
            //Reporter.log("Pass");
        }
        catch(AssertionError e)
        {
            System.out.println(e);
            //Reporter.log(e.getMessage());
            //Reporter.log("Fail");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
