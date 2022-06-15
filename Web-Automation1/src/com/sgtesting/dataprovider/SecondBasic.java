package com.sgtesting.dataprovider;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondBasic {
	public static WebDriver oBrowser=null;
	
	@Test(priority=1)
	private static void launchBrowser() {
	
		try		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\sample\\First\\TestNG\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();

		}catch(Exception e)		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	private static void navigateURL()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider="logindetails")
	private  void login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(2000);
			Thread.sleep(2000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider(name="logindetails")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	
	
	@Test(priority=4,dataProvider="createUserDetails")
	private  void createUser(String firstName,String lastName,String email,String username,String password,String passwordCopy)
	{
		try {
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(firstName);
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys(lastName);
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys(email);
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(passwordCopy);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@DataProvider(name="createUserDetails")
	public Object[][] getCreateUser()
	{
		return new Object[][] {{"demo1","user1","demo1user1@gmail.com","demo1user1","demouser","demouser"}};
	}
	@Test(priority=5)
	private static void deleteUser()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();Thread.sleep(2000);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='user1, demo1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert oalert=oBrowser.switchTo().alert();
			String str=oalert.getText();
			System.out.println(str);
			oalert.accept();
			Thread.sleep(2000);Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 @Test(priority=6)
		private static void logout()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("Logout")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		 @Test(priority=7)
		private void closeApplication()
		{
			try
			{
				oBrowser.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		

}
