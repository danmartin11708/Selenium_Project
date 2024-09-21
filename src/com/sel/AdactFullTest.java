package com.sel;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdactFullTest {
	
	private static Object FileUtils;

	public static void main(String[] args) throws IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Danjr11708");
		driver.findElement(By.name("password")).sendKeys("Dan11708");
		driver.findElement(By.name("login")).click();
		//2page
		WebElement element = driver.findElement(By.className("search_combobox"));
		Select s = new Select(element);
		s.selectByValue("London");
		
		
		WebElement element2 = driver.findElement(By.id("hotels"));
		Select sc = new Select(element2);
		sc.selectByVisibleText("Hotel Sunshine");
		
		WebElement element3 = driver.findElement(By.id("room_type"));
		Select sc3 = new Select(element3);
		sc3.selectByVisibleText("Deluxe");
		
		WebElement element4 = driver.findElement(By.id("room_nos"));
		Select sc4 = new Select(element4);
		sc4.selectByValue("3");
		
		driver.findElement(By.className("date_pick")).sendKeys("30/08/2024");
		
		WebElement element5 = driver.findElement(By.id("adult_room"));
		Select sc5 = new Select(element5);
		sc5.selectByValue("2");
		driver.findElement(By.id("Submit")).click();
		
		//3page
		Actions act = new Actions(driver);
		WebElement element6 = driver.findElement(By.id("radiobutton_0"));
		act.click(element6).perform();
		driver.findElement(By.id("continue")).click();
		
		//4page
		driver.findElement(By.name("first_name")).sendKeys("Daniel");
		driver.findElement(By.name("last_name")).sendKeys("Joseph");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Vadaplalani");
		driver.findElement(By.name("cc_num")).sendKeys("9088765432113434");
		WebElement element7 = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select sc6 = new Select(element7);
		sc6.selectByVisibleText("VISA");
		
		WebElement element8 = driver.findElement(By.id("cc_exp_month"));
		Select sc7 = new Select(element8);
		sc7.selectByValue("2");
		
		WebElement element9 = driver.findElement(By.id("cc_exp_year"));
		Select sc8 = new Select(element9);
		sc8.selectByValue("2030");
		
        driver.findElement(By.name("cc_cvv")).sendKeys("908");
        driver.findElement(By.name("book_now")).click();
        
        //5page
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,7000)");
        
        TakesScreenshot ts=(TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Dany\\eclipse-workspace\\Selenium_Project\\Screenshot");
        org.openqa.selenium.io.FileHandler.copy(src, dest);
        driver.quit();
        
       
		
		
	}

}
