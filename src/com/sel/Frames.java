package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/frame");
	driver.manage().window().maximize();
	//going to first frame using id
	driver.switchTo().frame("firstFr");
	driver.findElement(By.name("fname")).sendKeys("daniel");
	driver.findElement(By.name("lname")).sendKeys("joseph");
	
	WebElement element = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
	driver.switchTo().frame(element);
	
	WebElement element2 = driver.findElement(By.name("email"));
	element2.sendKeys("vjjo11708");
	driver.switchTo().defaultContent();
	driver.close();

	
}
}
