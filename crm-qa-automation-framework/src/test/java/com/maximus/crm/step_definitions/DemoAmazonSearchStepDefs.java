package com.maximus.crm.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.maximus.crm.pages.DemoAmazonHomePage;
import com.maximus.crm.utilities.ConfigurationReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAmazonSearchStepDefs {

	private WebDriver driver;
	private DemoAmazonHomePage demoHomePage;
	private String keyword;
	
	

@Given("^I am on amazon home page$")
public void i_am_on_amazon_home_page() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(ConfigurationReader.getProperty("url"));
    assertTrue(driver.getTitle().startsWith("Amazon.com"));

}

@Given("^I search for (.*)$")
public void i_search_for(String keyword) {
    this.keyword = keyword;
 demoHomePage = new DemoAmazonHomePage (driver);
    demoHomePage.searchBox.sendKeys(keyword + Keys.ENTER);
    System.out.println("Searching for "+ keyword);
}

@Then("^Search result should be displayed$")
public void search_result_should_be_displayed() {
	assertTrue(driver.getTitle().endsWith(keyword));
	driver.quit();
   
}
	
}
