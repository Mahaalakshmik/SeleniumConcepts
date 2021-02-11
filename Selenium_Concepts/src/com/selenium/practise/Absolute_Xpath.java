package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_89%3ASamsung&dc&qid=1611824710&rnid=3837712031&ref=lp_1389401031_nr_p_89_3");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement samsung_Phone = driver.findElement(By.xpath("//div[@id='search']/div/div[2]/div/span[3]/div[2]/div[14]/div/span/div/div/div[2]/div/div/div/span/a/div/img"));
		samsung_Phone.click();
		driver.quit();
	}

}
