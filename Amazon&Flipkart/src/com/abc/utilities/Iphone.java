package com.abc.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Iphone {
	WebDriver driver;
	By price = By.xpath("//span[text()='Apple iPhone XR (64GB) - Yellow']/../../../../../../../div[2]/div[1]/div/div[1]/div/div/a[1]/span");
	
	

	public Iphone(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public String getPrice()
	{
		 return driver.findElement(price).getText().substring(1);
	}
	

}
