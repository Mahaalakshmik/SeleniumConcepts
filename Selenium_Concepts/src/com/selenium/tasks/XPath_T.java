package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_T {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("hello@gmail.com");
		WebElement insta_Txt = driver.findElement(By.xpath("//h1[text()='Instagram']"));
		String output = insta_Txt.getText();
		System.out.println(output);
		WebElement password = driver.findElement(By.xpath("//input[contains(@aria-label,'Passw')]"));
		password.sendKeys("hai");
		WebElement login_Txt = driver.findElement(By.xpath("//span[contains(text(),'in')]"));
		String output1 = login_Txt.getText();
		System.out.println(output1);
		

	}

}
