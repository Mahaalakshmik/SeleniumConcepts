package com.automation.practise_Shopping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login_Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement sign_In = driver.findElement(By.xpath("//a[@class = 'login']"));
		sign_In.click();
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("simba200@gmail.com");
		WebElement create_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		create_Btn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement gender_Title = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender_Title.click();
		WebElement first_Name = driver.findElement(By.id("customer_firstname"));
		first_Name.sendKeys("Haarikha");
		WebElement last_Name = driver.findElement(By.id("customer_lastname"));
		last_Name.sendKeys("K");
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys("Queensize@1987");
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select s = new Select(day);
		s.selectByIndex(16);
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select s1 = new Select(month);
		s1.selectByValue("10");
		WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
		Select s2 = new Select(years);
		s2.selectByValue("1985"); //error at this line; unable to resolve it
		//WebElement sign_Upcheckbox = driver.findElement(By.xpath("//input[@type='checkbox'])[1]"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//sign_Upcheckbox.click();
		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		company.sendKeys("HP");
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("Chennai");
		WebElement address_2 = driver.findElement(By.id("address2"));
		address_2.sendKeys("Chennai");
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Chennai");
		WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
		Select s3 = new Select(state);
		boolean multiple_Dd = s3.isMultiple();
		System.out.println("multiple_Dd");
		s3.selectByValue("24");
		WebElement zip_Code = driver.findElement(By.xpath("//input[@class='form-control uniform-input text']"));
		zip_Code.sendKeys("00000");
		WebElement country = driver.findElement(By.xpath("(//select[@class='form-control'])[5]"));
		Select s4 = new Select(country);
		s4.selectByVisibleText("United States");
		WebElement text_area = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		text_area.sendKeys("aaaaa");
		WebElement home_Phone = driver.findElement(By.name("phone"));
		home_Phone.sendKeys("01111111111");
		WebElement mobile_Phone = driver.findElement(By.name("phone_mobile"));
		mobile_Phone.sendKeys("5555555555");
		WebElement alias_Address = driver.findElement(By.id("alias"));
		alias_Address.sendKeys("Netherland");
		WebElement register_Btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		register_Btn.click();
		
		
		
		
		
	}

}
