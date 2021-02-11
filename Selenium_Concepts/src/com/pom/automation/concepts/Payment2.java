package com.pom.automation.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment2 {

	@FindBy(xpath = "//a[@title='Pay by check.']")
	private WebElement payment_2;

}
