package com.pom.automation.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Snapshot {

	@FindBy(xpath = "//div[@class='box']")
	private WebElement order_Details;

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women_Tab2;

	@FindBy(xpath = "//a[@title='Dresses'])[1]")
	private WebElement dresses;

	@FindBy(xpath = "//a[@title='Evening Dresses'])[1]")
	private WebElement evening_Dress;

	public WebElement getOrder_Details() {
		return order_Details;
	}

	public WebElement getWomen_Tab2() {
		return women_Tab2;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEvening_Dress() {
		return evening_Dress;
	}
}
