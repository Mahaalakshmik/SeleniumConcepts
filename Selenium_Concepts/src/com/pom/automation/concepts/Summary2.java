package com.pom.automation.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Summary2 {

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement summary_2;

	public WebElement getSummary_2() {
		return summary_2;
	}

}
