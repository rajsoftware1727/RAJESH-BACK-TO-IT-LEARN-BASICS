package BASICS_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {
	
	//Learn about LOCATORS
	static WebDriver driver;
	
	@BeforeTest
	public static void OPEN_BROWSER()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	/*
	 * @AfterTest public static void CLOSE_BROWSER() {
	 * 
	 * }
	 */
	
	@Test
	public static void LOCATORS()
	{
		//USING ID 
		WebElement GOOGLE=driver.findElement(By.id("sI1XGe"));
		System.out.println("yes find the webelement");
		
		//USING TAG NAME
		
		WebElement Tagname=driver.findElement(By.tagName("Store"));
		System.out.println("yes identified by using TAGNAME");
		
	}

}
