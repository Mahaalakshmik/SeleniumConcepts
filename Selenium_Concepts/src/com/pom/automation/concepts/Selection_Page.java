package com.pom.automation.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection_Page {
	
	public static WebDriver driver;

	@FindBy(xpath = "//input[@class='text']")
	private WebElement qty_Value;

	@FindBy(id = "group_1")
	private WebElement drop_Down;

	@FindBy(name = "Blue")
	private WebElement colour;

	@FindBy(name = "Submit")
	private WebElement add_Cart;

	public Selection_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getqty_Value() {
		return qty_Value;
	}

	public WebElement getDrop_Down() {
		return drop_Down;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getAdd_Cart() {
		return add_Cart;
	}
}
