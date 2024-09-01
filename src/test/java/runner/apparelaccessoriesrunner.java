package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {
				"C:\\Users\\singh\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\CWP_Cucumber\\src\\test\\resources\\Naaptol\\women.feature",
				"C:\\Users\\singh\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\CWP_Cucumber\\src\\test\\resources\\Naaptol\\men.feature",
				"C:\\Users\\singh\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\CWP_Cucumber\\src\\test\\resources\\Naaptol\\accessories.feature"
		},
		glue = "steps"
		)

public class apparelaccessoriesrunner extends AbstractTestNGCucumberTests{

}
