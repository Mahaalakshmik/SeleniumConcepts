package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    WebElement creat_Btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
	    creat_Btn.click();
	    Thread.sleep(3000);
	    
	 // initializing the webelement with the help of driver
	    WebElement day = driver.findElement(By.xpath("//select [@aria-label='Day']"));
	    //creating objects with the help of select class to access drop down
	    Select s = new Select(day);
	    s.selectByValue("6");
	    WebElement month = driver.findElement(By.xpath("//select [@aria-label='Month']"));
	    Select s1 = new Select(month);
	    s1.selectByVisibleText("Nov");
	    WebElement year = driver.findElement(By.xpath("//select [@aria-label='Year']"));
	    Select s2 = new Select(year);
	    s2.selectByIndex(34);
	    
	    
	
	}
	

}
