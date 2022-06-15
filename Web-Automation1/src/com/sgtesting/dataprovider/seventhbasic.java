package com.sgtesting.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class seventhbasic 
{
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			//oBrowser.manage().window().maximize();

		}catch(Exception e)
		{
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
	@DataProvider(name="logindetails")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	 
	@Test(priority=3,dataProvider="logindetails")
	private  void login(String username ,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(username);Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	private static void minimiseFlyOutWindow()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider(name="createCustomer")
	public Object[][] getcreateCustomer()
	{
		return new Object[][] {{"Customer7"}};
	}
	@Test(priority=5,dataProvider="createCustomer")
	private  void createCustomer(String name)
	{
		try
		{
			Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys(name);
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
		    Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider(name="createProject")
	public Object[][] getcreateProject()
	{
		return new Object[][] {{"Bank"}};
	}
	@Test(priority=6,dataProvider="createProject")
	private  void createProject(String project)
	{
		try 
		{
			Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys(project);
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click(); Thread.sleep(2000);
		    Thread.sleep(2000);
		  }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider(name="createTasks")
	public Object[][] getcreateTasks()
	{
		return new Object[][] {{"WithDraw Process"}};
	}
	@Test(priority=7,dataProvider="createTasks")
	private  void createTasks(String tasks)
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Create new tasks']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys(tasks);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create Tasks']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void deleteTasks()
	{
		try
		{
			Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		    Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	private static void deleteProject()
	{
		try 
		{
			Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();
		    Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	private static void deleteCustomer()
	{
		try
		{

			Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath(" //*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		    Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	private static void logout()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	private static void closeApplication()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.close();
			System.out.println("===========Application closed sucessfully==========");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
