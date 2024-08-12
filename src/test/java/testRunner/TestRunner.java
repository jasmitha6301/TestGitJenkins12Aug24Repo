package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features={"C:\\Users\\mamid\\Sai-eclipse-work-space\\TestGitJenkins12Aug24\\src\\test\\java\\features\\Demo.feature"
		},
				glue= {"stepDefinition"}	
		
		)

public class TestRunner {
	
	

	     



}
