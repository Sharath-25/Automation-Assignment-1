package com.abc.prices;

import java.util.concurrent.TimeUnit;
import com.abc.utilities.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Controller {
	public static String priceFromAmazon;
	public static String priceFromFlipkart;
	static WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void testcase() {

		driver.get("https://www.amazon.in");
		Welcome w = new Welcome(driver);
		w.typePhone();
		w.clickSearch();
		Iphone iphone = new Iphone(driver);
		String price = iphone.getPrice();
		priceFromAmazon = price.replace(",", "");
		System.out.println(priceFromAmazon);

	}

	@Test
	public void testcase2() {
		driver.get("https://www.flipkart.com");

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8892676105");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kiran@123");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		Flipkart f = new Flipkart(driver);
		f.clickSearch();
		f.typePhone();
		f.clickSubmit();
		IphoneFlip iphoneFlip = new IphoneFlip(driver);
		String price = iphoneFlip.getPrice();
		priceFromFlipkart = price.replace(",", "");
		System.out.println(priceFromFlipkart);
		ComparePrices c = new ComparePrices(priceFromAmazon, priceFromFlipkart);
		c.check();
	}
	
	
}