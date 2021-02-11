package com.pom.automation.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Selection2 {

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement iframe_Btn;

	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement quantity_Btn;

	@FindBy(xpath = "//select[@class='form-control attribute_select no-print']")
	private WebElement drop_Dwn;

	@FindBy(name = "Pink")
	private WebElement colour_Pink;

	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addcart_Btn;

	public WebElement getIframe_Btn() {
		return iframe_Btn;
	}

	public WebElement getQuantity_Btn() {
		return quantity_Btn;
	}

	public WebElement getDrop_Dwn() {
		return drop_Dwn;
	}

	public WebElement getColour_Pink() {
		return colour_Pink;
	}

	public WebElement getAddcart_Btn() {
		return addcart_Btn;
	}

}
