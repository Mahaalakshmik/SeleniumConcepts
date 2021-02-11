package com.pom.automation.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	
	public static WebDriver driver;
	
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement check_Box;
	
	@FindBy(xpath = "//button[@type='submit'])[2]")
	private WebElement shipping_Co;

	public Shipping(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheck_Box() {
		return check_Box;
	}

	public WebElement getShipping_Co() {
		return shipping_Co;
	}

}
