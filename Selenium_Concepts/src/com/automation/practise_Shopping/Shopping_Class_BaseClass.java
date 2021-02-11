package com.automation.practise_Shopping;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.automation.concepts.Address;
import com.pom.automation.concepts.Bank_WirePayment;
import com.pom.automation.concepts.Home_Page;
import com.pom.automation.concepts.Login_Page;
import com.pom.automation.concepts.Payment;
import com.pom.automation.concepts.Proceed_Checkout1;
import com.pom.automation.concepts.Selection_Page;
import com.pom.automation.concepts.Shipping;
import com.pom.automation.concepts.Snapshot;
import com.pom.automation.concepts.Summary;
import com.pom.automation.concepts.Women_Page;
import com.selenium.concepts.Base_Class;

public class Shopping_Class_BaseClass extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		// + "\\Driver\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		driver = getDriver("chrome");

		// driver.get("http://automationpractice.com/index.php");

		get("http://automationpractice.com/index.php");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// waitConcepts("page load timeout", driver, 30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Home_Page home = new Home_Page(driver);
		clickOnElement(home.getSignin_Btn());

//		WebElement signin_Btn = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
//		signin_Btn.click();
//		clickOnElement(signin_Btn);
		
		Login_Page login = new Login_Page(driver);
		inputValueElement(login.getEmail_Id(), "anamica@gmail.com");
		inputValueElement(login.getPassword(), "Queensize@1987");
		clickOnElement(login.getLogin_Btn());
		
	//	WebElement email_Id = driver
		//		.findElement(By.xpath("(//input[contains(@class, 'is_required validate account')])[2]"));
		// email_Id.sendKeys("myaccount@gmail.com");
		//inputValueElement(email_Id, "anamica@gmail.com");

	//	WebElement password = driver.findElement(By.xpath("//input[@type = 'password']"));
		// password.sendKeys("Queensize@1987");

		//inputValueElement(password, "Queensize@1987");

//		WebElement login_Btn = driver.findElement(By.id("SubmitLogin"));
//		login_Btn.click();
	//	clickOnElement(login_Btn);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Women_Page women = new Women_Page(driver);
		actioning_Method(women.getWomen_Tab());
		actioning_Method(women.getTops());
		actioning_Method(women.getT_Shirts());
		actions_Click(women.getT_Shirts());
//		WebElement women_Tab = driver.findElement(By.xpath("//a[@title='Women']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(women_Tab).build().perform();

	//	actioning_Method(women_Tab);

		//WebElement tops = driver.findElement(By.xpath("(//a[@title='Tops'])[1]"));
//		a.moveToElement(tops).build().perform();
		//actioning_Method(tops);

//		WebElement t_Shirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
//		a.moveToElement(t_Shirts).build().perform();
//		a.click(t_Shirts).build().perform();

//		actioning_Method(t_Shirts);
	//	actions_Click(t_Shirts);
		
		clickOnElement(women.getFaded_Tshirt());
		
		
		//WebElement faded_Tshirt = driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[1]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", faded_Tshirt);
//		a.moveToElement(faded_Tshirt).build().perform();
//		javascript_Executor("scrollintoview()", faded_Tshirt);
//		javascript_Executor("scrollIntoView()", faded_Tshirt);
	//	clickOnElement(faded_Tshirt);
//		
		Thread.sleep(3000);
		
		clickOnElement(women.getQuick_View());
//		WebElement quick_ViewTshirt = driver
//				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]/span"));
//		a.moveToElement(quick_ViewTshirt).build().perform();
//		a.click(quick_ViewTshirt).build().perform();
//		actioning_Method(quick_ViewTshirt);
//		actions_Click(quick_ViewTshirt);
		driver.switchTo().frame(0);
		
		Selection_Page selection = new Selection_Page(driver);
		inputValueElement(selection.getqty_Value(), "3");
		
		WebElement qty_Value = driver.findElement(By.xpath("//input[@class='text']"));
//		inputValueElement(qty_Value, "3");
		System.out.println("done");
		Thread.sleep(2000);
		
		//driver.switchTo().frame(0);

//		WebElement iframe1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[2]/p[1]/a[2]/span']"));
	//	clickOnElement(iframe1);
				
		//driver.switchTo().frame(iframe1);
		
//		frameIndex(0);

		Thread.sleep(2000);
//		WebElement plus_Btn = driver.findElement(By.xpath("//a[contains(@class,'button-plus product_quantity_up')]"));
//		plus_Btn.click();
//		clickOnElement(plus_Btn);
		
		dropdown(selection.getDrop_Down(), "byIndex", "1");

//		WebElement drop_Down = driver.findElement(By.id("group_1"));
//		Select s = new Select(drop_Down);
//		dropdown(drop_Down, "byindex", "1");
//		s.selectByIndex(1);
	//	dropdown(drop_Down, "byIndex", "1");

		clickOnElement(selection.getColour());
//		WebElement colour = driver.findElement(By.name("Blue"));
//		colour.click();
//		clickOnElement(colour);

		clickOnElement(selection.getAdd_Cart());
//		WebElement add_Cart = driver.findElement(By.name("Submit"));
//		add_Cart.click();
//		clickOnElement(add_Cart);

		Thread.sleep(3000);
		
		Proceed_Checkout1 proceed = new Proceed_Checkout1(driver);
		clickOnElement(proceed.getProceed_Co());
		
//		WebElement proceed_Co = driver.findElement(
//				By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span/i"));
//		proceed_Co.click();
//		clickOnElement(proceed_Co);

		Summary summ = new Summary(driver);
		clickOnElement(summ.getSummary_Co());
		
//		WebElement summary_Co = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//		js.executeScript("arguments[0].scrollIntoView();", summary_Co);
//		summary_Co.click();
//		javascript_Executor("scrollintoview()", summary_Co);
//		clickOnElement(summary_Co);
		
		Address addr = new Address(driver);
		clickOnElement(addr.getAddress_Co());
		
	//	WebElement address_Co = driver.findElement(By.name("processAddress"));
//		js.executeScript("arguments[0].scrollIntoView();", address_Co);
//		address_Co.click();
		//javascript_Executor("scrollintoview()", address_Co);
		//clickOnElement(address_Co);
		
		Shipping ship = new Shipping(driver);
		clickOnElement(ship.getCheck_Box());
//		WebElement check_Box = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		check_Box.click();
//		clickOnElement(check_Box);

		clickOnElement(ship.getShipping_Co());
		
//		WebElement shipping_Co = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		shipping_Co.click();
	//	clickOnElement(shipping_Co);
		
		Payment pay = new Payment(driver);
		javascript_Executor("scrollintoview()", pay.getPayment_Wire());
		clickOnElement(pay.getPayment_Wire());
		
		//WebElement payment_Wire = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
//		js.executeScript("arguments[0].scrollIntoView();", payment_Wire);
//		payment_Wire.click();
	//	javascript_Executor("scrollintoview()", payment_Wire);
		//clickOnElement(payment_Wire);
		
		Bank_WirePayment bwp = new Bank_WirePayment(driver);
		javascript_Executor("scrollintoview()", bwp.getPayment_Details());
		
		//WebElement payment_Details = driver.findElement(By.xpath("//h3[@class='page-subheading']"));
//		js.executeScript("arguments[0].scrollIntoView();", payment_Details);
		//javascript_Executor("scrollintoview()", payment_Details);
		
		clickOnElement(bwp.getConfirmation_Btn());
		
		//WebElement confirmation_Btn = driver.findElement(By.xpath("//button[contains(@class,' button-medium')]"));
//		confirmation_Btn.click();
		//clickOnElement(confirmation_Btn);
		
		Snapshot sp = new Snapshot(driver);
		
		
		WebElement order_Details = driver.findElement(By.xpath("//div[@class='box']"));
//		js.executeScript("arguments[0].scrollIntoView();", order_Details);
//		javascript_Executor("scrollintoview()", order_Details);
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File(
//				"C:\\Users\\Mahaalakshmi K\\Desktop\\eclipse-workspace\\Selenium_Project\\Screenshot\\project.png");
//
//		FileUtils.copyFile(source, destination);
		snapShot("C:\\Users\\Mahaalakshmi K\\Desktop\\eclipse-workspace\\Selenium_Project\\Screenshot\\projectnew.png");

//		// Second Product Purchase

//		WebElement women_Tab2 = driver.findElement(By.xpath("//a[@title='Women']"));
//		a.moveToElement(women_Tab2).build().perform();
//		actioning_Method(women_Tab2, "movetoelement()");
//		
//		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[1]"));
//		a.moveToElement(dresses).build().perform();
//		actioning_Method(dresses, "movetoelement()");
//		
//		WebElement evening_Dress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
//		// js.executeScript("arguments[0].scrollIntoView();", evening_Dress);
//		evening_Dress.click();
//		clickOnElement(evening_Dress);
//		
//		WebElement printed_Dress = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
//		js.executeScript("arguments[0].scrollIntoView();", printed_Dress);
//		a.moveToElement(printed_Dress).build().perform();
//		actioning_Method(printed_Dress, "movetoelement()");
//		actioning_Method(printed_Dress, "click()");
//		
//		WebElement quick_View = driver
//				.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]/span"));
//		a.moveToElement(quick_View).build().perform();
//		a.click(quick_View).build().perform();
//		actioning_Method(quick_View, "movetoelement()");
//		actioning_Method(quick_View, "click()");
//
//		WebElement iframe_Btn = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//		driver.switchTo().frame(iframe_Btn);
//
//		WebElement quantity_Btn = driver
//				.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
//		quantity_Btn.click();
//		clickOnElement(quantity_Btn);
//		
//		WebElement drop_Dwn = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
//		Select s1 = new Select(drop_Dwn);
//		s1.selectByVisibleText("L");
//
//		WebElement colour_Pink = driver.findElement(By.name("Pink"));
//		colour_Pink.click();
//		clickOnElement(colour_Pink);
//
//		WebElement addcart_Btn = driver.findElement(By.xpath("//button[@class='exclusive']"));
//		addcart_Btn.click();
//		clickOnElement(addcart_Btn);
//		
//		Thread.sleep(3000);
//		
//		WebElement proceed_Click = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/i"));
//		proceed_Click.click();
//		clickOnElement(proceed_Click);
//		
//		WebElement check_Out1 = driver.findElement(
//				By.xpath("//html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span/i"));
//		check_Out1.click();
//		clickOnElement(check_Out1);
//
//		WebElement summary_2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//		js.executeScript("arguments[0].scrollIntoView();", summary_2);
//		summary_2.click();
//		clickOnElement(summary_2);
//		
//		WebElement address = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
//		js.executeScript("arguments[0].scrollIntoView();", address);
//		address.click();
//		clickOnElement(address);
//
//		WebElement check_Box2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		check_Box2.click();
//		clickOnElement(check_Box2);
//
//		WebElement shipping_2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		js.executeScript("arguments[0].scrollIntoView();", shipping_2);
//		shipping_2.click();
//		clickOnElement(shipping_2);

//		WebElement payment_2 = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
//		js.executeScript("arguments[0].scrollIntoView();", payment_2);
//		payment_2.click();
//		clickOnElement(payment_2);

//		WebElement orderconfirmation_2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		js.executeScript("arguments[0].scrollIntoView();", orderconfirmation_2);
//		orderconfirmation_2.click();
//		clickOnElement(orderconfirmation_2);
//
//		WebElement order_Summary = driver.findElement(By.xpath("//div[@class='box order-confirmation']"));
//		js.executeScript("arguments[0].scrollIntoView();", order_Summary);
//		javascript_Executor("scrollIntoView()", order_Summary);
//		
//		
//		TakesScreenshot ts1 = (TakesScreenshot) driver;
//		File source1 = ts1.getScreenshotAs(OutputType.FILE);
//		File Destination1 = new File(
//				"C:\\Users\\Mahaalakshmi K\\Desktop\\eclipse-workspace\\Selenium_Project\\Screenshot\\project2.png");
//		FileUtils.copyFile(source1, Destination1);
//
//		WebElement sign_Out = driver.findElement(By.xpath("//a[@class='logout']"));
//		sign_Out.click();
//		clickOnElement(sign_Out);
//
//		driver.quit();
//		
//		quit();

	}

}
