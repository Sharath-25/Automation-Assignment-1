package com.abc.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipkart {
	WebDriver flipkartDriver;
	By search = By.xpath("//input[@name='q']");
	By button = By.xpath("//button[@type='submit']");

	public Flipkart(WebDriver flipkartDriver) {

		this.flipkartDriver = flipkartDriver;
	}

	public void clickSearch() {
		flipkartDriver.findElement(search).click();
	}

	public void typePhone() {
		flipkartDriver.findElement(search).sendKeys("Apple iPhone XR (64GB) - Yellow");
	}

	public void clickSubmit() {
		flipkartDriver.findElement(button).click();
	}

}
