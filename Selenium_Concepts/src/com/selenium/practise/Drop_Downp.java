package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Downp {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement create_Btn = driver.findElement(By.xpath("//a[@role='button'][1]"));
		create_Btn.click();
		Thread.sleep(2000);
		WebElement first_Name = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		first_Name.sendKeys("Radhikha");
		WebElement sur_Name = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		sur_Name.sendKeys("K");
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("6");
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Nov");
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByIndex(8);
		
		
		
	}

}
