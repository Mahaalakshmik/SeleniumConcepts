package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_LocatorsT {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement contact_Us = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		contact_Us.click();
		WebElement name = driver.findElement(By.id("InputName"));
		name.sendKeys("Anamica");
		WebElement enquirer = driver.findElement(By.name("email"));
		enquirer.sendKeys("Abc@gmail.com");
		WebElement mobile_No = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mobile_No.sendKeys("1111111111");
		WebElement message = driver.findElement(By.xpath("//textarea[@placeholder='Message*']"));
		message.sendKeys("Interested");

	}

}
