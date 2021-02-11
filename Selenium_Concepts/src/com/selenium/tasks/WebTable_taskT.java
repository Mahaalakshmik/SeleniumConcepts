package com.selenium.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_taskT {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?source=hp&ei=ewj4X-DKFsntz7sPsqYJ&q=population+of+india+state+wise&oq=population+of+india+&gs_lcp=CgZwc3ktYWIQAxgEMgUIABDJAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADoICAAQsQMQyQM6CAgAELEDEIMBOgUILhCxAzoFCAAQsQM6CAguEMcBEKMCOgIILjoLCC4QsQMQxwEQrwFQoBpYpElg1mFoAHAAeACAAVOIAe0CkgEBNZgBAKABAaoBB2d3cy13aXo&sclient=psy-ab");
		//driver.manage().window().maximize();
		// COLUMN DATA
		List<WebElement> State = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		for (WebElement webElement : State) {
			
			String output = webElement.getText();
			System.out.println(output);
		}
		
	}

}
