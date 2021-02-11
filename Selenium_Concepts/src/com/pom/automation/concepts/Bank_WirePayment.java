package com.pom.automation.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_WirePayment {

	public static WebDriver driver;
	@FindBy(xpath = "//h3[@class='page-subheading']")
	private WebElement payment_Details;

	@FindBy(xpath = "//button[contains(@class,' button-medium')]")
	private WebElement confirmation_Btn;

	public Bank_WirePayment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPayment_Details() {
		return payment_Details;
	}

	public WebElement getConfirmation_Btn() {
		return confirmation_Btn;
	}

}
