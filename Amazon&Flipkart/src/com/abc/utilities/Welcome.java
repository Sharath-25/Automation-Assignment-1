package com.abc.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	WebDriver driver;
	By search = By.xpath("//input[@id='twotabsearchtextbox']");
	By button = By.xpath("//input[@type='submit']");

	public Welcome(WebDriver driver) {

		this.driver = driver;
	}

	public void typePhone() {
		driver.findElement(search).sendKeys("Apple iPhone XR (64GB) - Yellow");
	}

	public void clickSearch() {
		driver.findElement(button).click();
	}

}
