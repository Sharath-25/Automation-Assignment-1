package com.abc.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Ratings {
	WebDriver driver;

	By ratings = By.xpath("//span[@id='bubble_rating']");
	By title = By.xpath("//input[@id='ReviewTitle']");
	By review = By.xpath("//textarea[@id='ReviewText']");
	By service = By.xpath("//span[@id='qid12_bubbles']");
	By clean = By.xpath("//span[@id='qid14_bubbles']");
	By roomsrate = By.xpath("//span[@id='qid11_bubbles']");
	By checkbox = By.xpath("//input[@type='checkbox']");
	By submitButton = By.xpath("//div[@id='SUBMIT']");

	public Ratings(WebDriver driver) {
		this.driver = driver;
	}

	public void rating() {
		driver.findElement(ratings).click();

	}

	public void typeTitle() {
		driver.findElement(title).sendKeys("Amazing Place");
	}

	public void typeReview() {
		driver.findElement(review).sendKeys("I enjoyed a lot. Must visit place.Excellect weather");
	}

	public void selectService() {
		driver.findElement(service).click();

	}

	public void cleanliness() {
		driver.findElement(clean).click();

	}

	public void rooms() {
		driver.findElement(roomsrate).click();
	}

	public void submitReview() {
		driver.findElement(checkbox).click();
	}

	public void clickSubmitReview() {
		driver.findElement(submitButton).click();
	}
}
