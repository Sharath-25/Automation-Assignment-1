package com.abc.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Review {
	WebDriver driver;
	By review = By.xpath("//a[text()='Write a review']");

	public Review(WebDriver driver) {
		this.driver = driver;
	}

	public void writeReview() {
		driver.findElement(review).click();
	}
}
