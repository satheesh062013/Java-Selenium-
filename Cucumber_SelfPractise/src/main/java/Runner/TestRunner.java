package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.Cucumber;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(
			
features ="C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Cucumber_SelfPractise\\src\\main\\java\\Features\\Login.feature",
glue="stepDefinitions",
dryRun=false,
//monochrome="",
format = {"pretty","html:test-output"}

			)

public class TestRunner {

}
