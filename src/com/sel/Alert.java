package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		WebElement element = driver.findElement(By.id("accept"));
		element.click();
		Thread.sleep(2000);
	org.openqa.selenium.Alert al= driver.switchTo().alert();
	al.accept();
	
	
	driver.findElement(By.id("confirm")).click();
	al.dismiss();
	
	driver.findElement(By.id("prompt")).click();
	al.sendKeys("alan");
	al.accept();
	
			
	}
}
