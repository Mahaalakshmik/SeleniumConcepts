package com.pom.automation.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Address_2 {

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

}
