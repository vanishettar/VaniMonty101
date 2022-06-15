package com.sgtesting.ObjectMap;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAssigOP1 {

	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;


	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			filename="E:\\SeleniumAutomation\\Automation\\Web-Automation1\\ObjectMap\\objectmap.properties1";
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkSpace\\Web-Automation1\\TestNG\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);

		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	private static void navigate()
	{
		try
		{
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost:82/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("userbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("adduserbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userfirstname")).sendKeys("demo");
			oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("User1");
			oBrowser.findElement(objectmap.getLocator("useremailid")).sendKeys("demouser1@gmail.com");
			oBrowser.findElement(objectmap.getLocator("userusername")).sendKeys("demoUser1");
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("Welcome123");
			oBrowser.findElement(objectmap.getLocator("userretypepassword")).sendKeys("Welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createuserbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("selectuserbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userdeletenutton")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
