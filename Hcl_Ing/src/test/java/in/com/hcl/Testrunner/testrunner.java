package in.com.hcl.Testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features="src\\test\\java\\in\\com\\hcl\\Feature", 
glue="in.com.hcl.StepDefinition",plugin={"pretty","html:target/reports","json:target/reports.json"},tags="@UITest")



public class testrunner {
	
	

}