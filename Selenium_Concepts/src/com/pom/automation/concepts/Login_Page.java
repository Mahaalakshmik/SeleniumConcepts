package com.pom.automation.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//input[contains(@class, 'is_required validate account')])[2]")
	private WebElement email_Id;
	
	@FindBy(xpath = "//input[@type = 'password']")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement login_Btn;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail_Id() {
		return email_Id;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}
}
