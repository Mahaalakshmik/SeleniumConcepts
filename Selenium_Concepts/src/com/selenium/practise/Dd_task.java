package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd_task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement passport_Office = driver.findElement(By.xpath("(//select[@class='dropdown-box'])[1]"));
		Select s = new Select(passport_Office);
		s.selectByIndex(1);
		WebElement gvn_Name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		gvn_Name.sendKeys("Radhika");
		

	}

}
