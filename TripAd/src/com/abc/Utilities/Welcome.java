package com.abc.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	WebDriver driver;
	By place = By.xpath("//span[text()='Club Mahindra Virajpet, Coorg']");

	public Welcome(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPlace() {
		driver.findElement(place).click();
	}

}
