package StepDefinitions;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import cucumber.Shareobjects;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.RegistrationPage;



public class MyStepDefinition {
	
	//private ExtentTest step;
	
	/*public MyStepDefinition(TestContext context) {
		testContext = context;
		
		//querryobjects=new BFrameworkQueryObjects();
		
		 
	}*/
	Shareobjects context;
	RegistrationPage registrationPage;
	//BFrameworkQueryObjects querryobjects;
	WebDriver driver;
	
	public MyStepDefinition(Shareobjects context) {
		context = context;
		registrationPage = context.getPageObjectManager().registrationobjectPage();
	
		driver=RegistrationPage.driver;
		//BFrameworkQueryObjects=
		//querryobjects=new BFrameworkQueryObjects();
		
		 
	}
	
	
	@Given("I am on rhp Flight egestration page")
	public void i_am_on_rhp_Flight_egestration_page() {
	
		 Reporter.addStepLog("running step I am on rhp Flight egestration page");
		 Reporter.addStepLog("running step I am on rhp Flight egestration page................");
	}

	@When("Enter the information of User")
	public void enter_the_information_of_User() {
		//ExtentTestManager.childstartTest("Enter the information of User");
		
		 Reporter.addStepLog("running step Enter the information of User");
		 Reporter.addStepLog("running step Enter the information of User................");
	}

	@Then("Registration should be successfull")
	public void registration_should_be_successfull() {
		//ExtentTestManager.childstartTest("Registration should be successfull");
		assertTrue("not match", false);
	}
    
    public static String right(String value, int length) {
		// To get right characters from a string, change the begin index.
		return value.substring(value.length() - length);
	}

}