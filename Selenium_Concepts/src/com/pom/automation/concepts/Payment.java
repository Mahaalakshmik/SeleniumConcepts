package com.pom.automation.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement payment_Wire;

	public Payment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPayment_Wire() {
		return payment_Wire;
	}

}
