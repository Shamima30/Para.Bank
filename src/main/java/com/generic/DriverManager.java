package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	//open Chromebrowser
	public WebDriver getChromeDriver(WebDriver driver) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
				return driver;
	}
	// open firefox browser
	
	public WebDriver getFirefoxDriver(WebDriver driver) {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
				return driver;
	}
	//open edge browser
	public WebDriver gerEdgeDriver(WebDriver driver) {
		driver= new EdgeDriver();
		driver.manage().window().maximize();
				return driver;
	}
}
