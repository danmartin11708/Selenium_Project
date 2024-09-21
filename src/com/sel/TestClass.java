package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Thread.sleep(2000);
		WebElement srch = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='LEO MOVIE';", srch);
		WebElement clck = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
		js.executeScript("arguments[0].click();", clck);
		WebElement wiki = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", wiki);
		js.executeScript("arguments[0].click();", wiki);

		
		
		
	}
	
	
	

}
