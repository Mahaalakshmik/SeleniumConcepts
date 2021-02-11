package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/?gclid=EAIaIQobChMI2rfD9NeL7gIV2YNLBR1yMwaPEAAYASAAEgKBkfD_BwE&ef_id=EAIaIQobChMI2rfD9NeL7gIV2YNLBR1yMwaPEAAYASAAEgKBkfD_BwE:G:s&s_kwcid=AL!739!3!354086747737!e!!g!!flipcart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_city_goog");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		
	}

}
