package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"C:\\Users\\Public\\sepetember21\\mylastHomework\\src\\test\\java\\features"},
	glue = "steps",
	tags = "@Scenario1",
	monochrome = true,
	dryRun = false,
	plugin = {
			"pretty",
			"html:target/cucumber",
			"json:target/cucumber.json"
	}
	
		)
public class LoginRunner {
		

}