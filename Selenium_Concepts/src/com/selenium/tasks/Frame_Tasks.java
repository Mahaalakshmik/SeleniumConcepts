package com.selenium.tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_Tasks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement continue_Btn = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		continue_Btn.click();
		WebElement login_Btn = driver.findElement(By.xpath("//input[@type='submit']"));
		login_Btn.click();
		Alert sim_Alert = driver.switchTo().alert();
		sim_Alert.accept();

	}

}
