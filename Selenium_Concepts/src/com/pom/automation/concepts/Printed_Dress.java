package com.pom.automation.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Printed_Dress {

	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement printed_Dress;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]/span")
	private WebElement quick_View;

	public WebElement getPrinted_Dress() {
		return printed_Dress;
	}

	public WebElement getQuick_View() {
		return quick_View;
	}

}
