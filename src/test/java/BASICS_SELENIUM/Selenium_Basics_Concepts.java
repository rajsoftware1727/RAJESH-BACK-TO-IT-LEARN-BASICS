package BASICS_SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
public class Selenium_Basics_Concepts {
	
	
	public static WebDriver driver;
	
	public static void main(String args[])
	{
		/*
		 * driver=new EdgeDriver(); driver.manage().window().maximize();
		 * driver.get("http://www.google.com");
		 */
		
		Employee e=new Employee();
		e.name="rajesh";
		System.out.println(e.name);
		e.angryType();
		Men m=new Employee();
		m.angryType();
		
	}
//practice about Type cast 
	
}

class Men
{
	String name;// data member
	
	void angryType()
	{
		System.out.println("based on situtaion");
	}
	
	
	
}
class Employee extends Men
{
	int idNo;
	String designation;
	void angryType()
	{
		System.out.println("cool");
	}
}
class Father extends Men
{
	int amountSpend;
	void angryType()
	{
		System.out.println("so hot");
	}
}

interface WebDriver1
{
	void get();
	void findelements();
}
class browser implements WebDriver1
{

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("open link");
	}

	@Override
	public void findelements() {
		// TODO Auto-generated method stub
		System.out.println("webelements");
	}
	
}
