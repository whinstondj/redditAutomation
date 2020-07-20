package com.techbeamers.testng;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumWeddriverTest {
	

  @Test
  public void myTestCaseNgReport() {
	  
		ChromeOptions options = new ChromeOptions();
		//if you're visiting reddit for first time, you'll need to remove some notifications
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-extensions");
		//please change the location of your chromedriver
		System.setProperty("webdriver.chrome.driver", "//Users//winstoncastillo//Documents//chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.reddit.com/");
		//I am going to save the title to compare it in the future and make sure the user is in homepage
	    String homePageTitle = driver.getTitle();
		driver.findElement(By.className("VIlSggfRUkuuHTKa_h8jp")).click();
		driver.findElement(By.className("_3m4MQxMy4WfgIkMhHh-UAg")).click();
		driver.findElement(By.id("header-search-bar")).sendKeys("Testing Concepts");
		driver.findElement(By.id("header-search-bar")).click();
		//I am going ot save the URL for the first result in the list
		String linkToGo = driver.findElement(By.partialLinkText("TestingConcepts")).getAttribute("href");
		//To make sure all this code is going to open a tab, no matter the browser, I am going to use some Javascript to open the tab
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open();");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    //I am opening the url for the first result that I saved in the variable
	    driver.get(linkToGo);
	    driver.findElement(By.className("_30BbATRhFv3V83DHNDjJAO")).click();
	    String currentTitle = driver.getTitle();
	    if(currentTitle.equals(homePageTitle))
	    			System.out.println("Home Page had been opened succesfully");
	    		else
	    			System.out.println("You're not in HomePage");
		driver.findElement(By.className("VIlSggfRUkuuHTKa_h8jp")).click();
		driver.findElement(By.className("_3m4MQxMy4WfgIkMhHh-UAg")).click();
		driver.quit();
	  
  }
  
}
