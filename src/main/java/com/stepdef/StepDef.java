package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.generic.DriverManager;
import com.masterPageFactory.ParaBankPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
WebDriver driver;
   ParaBankPageFactory pbf;
   
	@Given("Open the browser")
	public void open_the_browser() {
	    //WebDriver driver = new ChromeDriver();
		DriverManager dm = new DriverManager();
		driver = dm.getChromeDriver(driver);
	}

	@Given("pass the parabank url{string}")
	public void pass_the_parabank_url(String url) {
	    
	    driver.get(url);
	}

	@When("Enter the user name {string}")
	public void enter_the_user_name(String username) {
		 pbf = new ParaBankPageFactory(driver);
	    pbf.getUsername().sendKeys(username);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
	    pbf.getPassword().sendKeys(password);
	    
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    pbf.getLoginbtn().click();
	    
	}

	@Then("Validate Login is successful")
	public void validate_login_is_successful() {
	   Assert.assertTrue("Login is successful", pbf.getLogout().isDisplayed());
	    if(pbf.getLogout().isDisplayed()) {
	    	System.out.println("Login successful");
	    }else {System.out.println("login failed");}
	}
	@Given("Quit all browser")
	public void tearDown() {
		driver.quit();
	}
	@Then ("Validate error message is displayed")
	public void getError() {
		Assert.assertTrue("login is not successful", pbf.getErrorMsg().isDisplayed());
		if(pbf.getErrorMsg().isDisplayed()) {
			System.out.println("test passed");
		}else {System.out.println("test failed");}
	}
	
	
}
