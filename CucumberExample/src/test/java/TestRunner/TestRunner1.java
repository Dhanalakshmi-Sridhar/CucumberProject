package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Feature", glue={"StepDefinition"},
        plugin = {"pretty","html:target/Cucumber-Report/reports.html"},monochrome = true)
// create a folder for Cucumber report under Target folder

public class TestRunner1 extends AbstractTestNGCucumberTests
{

}
