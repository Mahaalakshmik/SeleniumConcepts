package com.pom.automation.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Proceed_Checkout2 {

	@FindBy(xpath = "//html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span/i")
	private WebElement check_Out1;

	public WebElement getCheck_Out1() {
		return check_Out1;
	}
}
