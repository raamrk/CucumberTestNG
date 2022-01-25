package testrunner;

import org.junit.runner.RunWith;

import base.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/NopCommerce.feature", glue = "stepdefinition", monochrome = true, plugin = {
		"pretty", "html:test-output" }

)
public class TestRun extends BaseClass{

}
