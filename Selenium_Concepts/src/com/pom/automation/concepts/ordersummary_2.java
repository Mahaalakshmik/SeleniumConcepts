package com.pom.automation.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ordersummary_2 {

	@FindBy(xpath = "//div[@class='box order-confirmation']")
	private WebElement order_Summary;

}
