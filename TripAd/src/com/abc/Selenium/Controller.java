package com.abc.Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.abc.Utilities.Ratings;
import com.abc.Utilities.Review;
import com.abc.Utilities.Welcome;

public class Controller {

	@Test
	public void testcase() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://tripadvisor.in");
		WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
		search.click();
		Thread.sleep(5000);
		search.sendKeys("Club Mahindra");
		driver.findElement(By.xpath("//div[@id='SEARCH_BUTTON_CONTENT']")).click();

		Welcome w = new Welcome(driver);
		w.clickPlace();

		Set<String> set = driver.getWindowHandles();
		for (String s : set) {
			driver.switchTo().window(s);

		}
		Review review = new Review(driver);
		review.writeReview();
		Set<String> set1 = driver.getWindowHandles();
		for (String s : set) {
			driver.switchTo().window(s);

		}

		Ratings r = new Ratings(driver);
		r.rating();
		r.typeTitle();
		r.typeReview();
		r.selectService();
		r.cleanliness();
		r.rooms();
		r.submitReview();
		r.clickSubmitReview();
		driver.quit();
	}

}
