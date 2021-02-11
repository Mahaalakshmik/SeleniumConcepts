package com.pom.automation.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page {
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women_Tab;
	
	@FindBy(xpath = "(//a[@title='Tops'])[1]")
	private WebElement tops;

	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement t_Shirts;
	
	
	@FindBy(xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[1]")
	private WebElement faded_Tshirt;
	
	public WebElement getFaded_Tshirt() {
		return faded_Tshirt;
	}

	public WebElement getQuick_View() {
		return quick_View;
	}

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]/span")
	private WebElement quick_View;

	public Women_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen_Tab() {
		return women_Tab;
	}

	public WebElement getTops() {
		return tops;
	}

	public WebElement getT_Shirts() {
		return t_Shirts;
	}
	
	

}	
