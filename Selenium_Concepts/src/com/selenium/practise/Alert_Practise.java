package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Practise {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		WebElement signin_Btn = driver.findElement(By.xpath("//input[@type='submit']"));
		signin_Btn.click();
		driver.switchTo().alert().accept();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		WebElement continue_Btn = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		continue_Btn.click();
		Thread.sleep(3000);
		WebElement login_Btn = driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
		login_Btn.click();
		driver.switchTo().alert().accept();
	}

}
