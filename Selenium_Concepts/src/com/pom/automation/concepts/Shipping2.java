package com.pom.automation.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shipping2 {

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement check_Box2;

	@FindBy(xpath = "//button[@type='submit'])[2]")
	private WebElement shipping_2;

	public WebElement getCheck_Box2() {
		return check_Box2;
	}

	public WebElement getShipping_2() {
		return shipping_2;
	}

}
