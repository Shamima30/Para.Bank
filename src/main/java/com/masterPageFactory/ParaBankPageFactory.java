package com.masterPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParaBankPageFactory {
	
	public ParaBankPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
		
		
	}
	
			@FindBy (xpath="//*[@name ='username']")
			private WebElement username;
			
			@FindBy (xpath ="//*[@type ='password']")
			private WebElement password;
			
			@FindBy (xpath= "//*[@type ='submit']")
			private WebElement loginbtn;
			
			@FindBy (xpath = "//*[contains(a,'Log Out')]")
			private WebElement logout;
			
			@FindBy(xpath="//*[text()='The username and password could not be verified.']")
			public WebElement errorMsg;
			
			
			
			public WebElement getErrorMsg() {
				return errorMsg;
			}


			public WebElement getUsername() {
				return username;
			}
			

			public WebElement getPassword() {
				return password;
			}
			public WebElement getLoginbtn() {
				return loginbtn;
			}

			public WebElement getLogout() {
				return logout;
			}
}
