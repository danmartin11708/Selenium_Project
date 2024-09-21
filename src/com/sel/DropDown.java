package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
         public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://letcode.in/dropdowns");
			driver.manage().window().maximize();
			WebElement multi = driver.findElement(By.id("superheros"));
			Select s = new Select(multi);
			s.selectByVisibleText("Batman");
			Thread.sleep(2000);
			s.selectByIndex(4);
			Thread.sleep(2000);
            s.selectByValue("bp");
            s.deselectByValue("bp");
            
            List<WebElement> getAll = s.getOptions();
            for (WebElement all : getAll) {
            	System.out.println(all.getText());
				
			}
            
            System.out.println("allselectedoptions");
            List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
            for (WebElement allselect : allSelectedOptions) {
            	System.out.println(allselect.getText());
				
			}
            
            
            System.out.println("first selected");
            WebElement firstSelectedOption = s.getFirstSelectedOption();
           System.out.println(firstSelectedOption.getText());
			}
            
            
            
            
            
            
            
            
           }

