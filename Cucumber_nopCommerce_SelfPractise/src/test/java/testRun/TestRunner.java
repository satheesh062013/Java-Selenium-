package testRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		features ="C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Cucumber_nopCommerce_SelfPractise\\src\\test\\java\\Features\\Login.feature",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin={"pretty","html:test-output"}

			)

public class TestRunner {

}
