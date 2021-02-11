package com.selenium.tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_Concepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(courses).build().perform();
		WebElement oracle_Trng = driver.findElement(By.xpath("//a[text()='Oracle Training ']"));
		a.moveToElement(oracle_Trng).build().perform();
		WebElement sql_Trng = driver.findElement(By.xpath("//a[text()='Oracle SQL Training']"));
		a.moveToElement(sql_Trng).build().perform();
		a.click(sql_Trng).build().perform();
		WebElement first_Text = driver.findElement(By.xpath("//h1[text()='ORACLE SQL TRAINING IN CHENNAI']"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String output = first_Text.getText();
		System.out.println(output);
		
		
	}

}
