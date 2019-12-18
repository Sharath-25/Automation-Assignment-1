package com.abc.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IphoneFlip {
	WebDriver flipkartDriver;

	By price = By.xpath("//div[text()='Apple iPhone XR (Yellow, 64 GB)']/../../div[2]/div[1]/div/div[1]");

	public IphoneFlip(WebDriver flipkartDriver) {
		this.flipkartDriver = flipkartDriver;
	}

	public String getPrice() {
		return flipkartDriver.findElement(price).getText().substring(1);
	}

}
