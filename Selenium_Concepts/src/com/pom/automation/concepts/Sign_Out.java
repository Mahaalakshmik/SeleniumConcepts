package com.pom.automation.concepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sign_Out {
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement sign_Out;

	public WebElement getSign_Out() {
		return sign_Out;
	}
	

}
