package CucumberOptions;	

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

//feature
@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "html:target/cucumber-html-report",
		        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
		    "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
		        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml",
		"rerun:target/rerun.txt"
		       },
			
		
		 features={"classpath:features"},
		glue={"StepDefinitions"}
		
		)
public class TestRunner {
	
		

	 public static void main(String[] args) throws Throwable {
	        cucumber.api.cli.Main.main(args );
	    }


}