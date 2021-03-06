package com.selenium.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Concepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(courses).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement software = driver.findElement(By.xpath("//a[text()='Software Testing Training ']"));
		a.moveToElement(software).build().perform();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement manual = driver.findElement(By.xpath("//a[text()='Manual Testing Training']"));
		a.moveToElement(manual).build().perform();
		a.click(manual).build().perform();
	}

}
