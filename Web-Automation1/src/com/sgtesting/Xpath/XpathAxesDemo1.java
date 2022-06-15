package com.sgtesting.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo1
{
    public static WebDriver oBrowser = null;
	public static void main(String[] args)
	{
		launchbrowser();
		navigate();
		//EnterSalaryForPersonRahulDravid();
		//EnterSalaryForPersonSachinTendulkar();
		//makeStatusActiveForIndianFreedomFighter();
		fromSachinTendulkarHisPrevious2ndRecordMakeSTatusAsActive();
		
		
		

	}
   






	private static void launchbrowser()
	{
		try
		{
			System.setProperty("WebDriver.chrome.driver", "E:\\SeleniumAutomation\\sample\\Objectmap\\Drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///D:/html/XPathAxes_11_June_2022/WebTableHTML.html");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
     private static void EnterSalaryForPersonRahulDravid() 
     {
		//for Rahul Dravid enterthe salary 50000 		
    	 oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following-sibling::td[4]/input")).sendKeys("50000");
    	
     }
 	
 	private static void EnterSalaryForPersonSachinTendulkar()
 	{
 	
 		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("15000");
 		//oBrowser.findElement(By.xpath("//*[@id=\"edit4\"]")).sendKeys("25000"); or we can copy xpath directly
 	}
	private static void makeStatusActiveForIndianFreedomFighter()
	{
		//oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();
		//oBrowser.findElement(By.xpath("//*[@id=\"chk2\"]")).click();    to find xpath click on status button
	}

	private static void fromSachinTendulkarHisPrevious2ndRecordMakeSTatusAsActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
		//oBrowser.findElement(By.xpath("//*[@id=\"chk2\"]")).click();
		
		
	}

	

		
		
		
		
		
		
		
		
		
	}


