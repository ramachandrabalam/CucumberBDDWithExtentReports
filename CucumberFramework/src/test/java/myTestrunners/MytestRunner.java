package myTestrunners;

import org.junit.runner.RunWith;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features"},
		glue= {"stepDefinitions","appHooks"},
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		monochrome= true//this is used to align the pretty report and remove unwanted characters

		)
public class MytestRunner {

}
