package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_XpathT {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/mobiles-accessories/mobiles/~apple-iphone-7-plus/pr?sid=tyy,4io&param=1&otracker=clp_banner_3_7.bannerX3.BANNER_apple-products-store_04EXHMW26D&fm=neo%2Fmerchandising&iid=M_d9b2d421-35e8-4c56-a01c-6443a4d9ab2d_7.04EXHMW26D&ppt=clp&ppn=apple-products-store&ssid=3y8qlef9n40000001610813980501");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement i_Phone7 = driver.findElement(By
				.xpath("//div[@id='container']/div/div[3]/div[2]/div/div[2]/div[3]/div/div/div/a/div/div/div/div/img"));
		Thread.sleep(2000);
		i_Phone7.click();
		driver.quit();
	}

}
