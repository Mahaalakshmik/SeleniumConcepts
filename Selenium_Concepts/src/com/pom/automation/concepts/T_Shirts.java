package com.pom.automation.concepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class T_Shirts {
	
	@FindBy(xpath = "//a[@title='Faded Short Sleeve T-shirts'])[1]")
	private WebElement faded_Tshirt;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]/span")
	private WebElement quick_ViewTshirt;

	public WebElement getFaded_Tshirt() {
		return faded_Tshirt;
	}

	public WebElement getQuick_ViewTshirt() {
		return quick_ViewTshirt;
	}
	

}
