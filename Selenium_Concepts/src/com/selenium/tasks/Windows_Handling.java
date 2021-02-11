package com.selenium.tasks;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.selenium.concepts.Base_Class;

public class Windows_Handling extends Base_Class{

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement best_Seller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		Actions a = new Actions(driver);
		a.contextClick(best_Seller).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.contextClick(mobiles).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement todays_Deal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		a.contextClick(todays_Deal).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		windowHandles("singlewindow", );
//		String parent_Id = driver.getWindowHandle();
//
//		Set<String> all_Windows = driver.getWindowHandles();
//		for (String string : all_Windows) {
//			String title = driver.switchTo().window(string).getTitle();
//			System.out.println(title);
//
//		}
//
//		String actual = "Amazon.in Bestsellers: The most popular items on Amazon";
//		for (String all_Id : all_Windows) {
//			if (driver.switchTo().window(all_Id).getTitle().equals(actual)) {
//				break;
//			}
//		}
	}

}
