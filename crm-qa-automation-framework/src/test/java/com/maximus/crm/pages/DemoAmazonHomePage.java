package com.maximus.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maximus.crm.utilities.Driver;

public class DemoAmazonHomePage {

	    private WebDriver driver;

	    public DemoAmazonHomePage(WebDriver driver) {
	    	this.driver = Driver.getDriver();
	    	PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(id="twotabsearchtextbox")
	    public WebElement searchBox;
	}

