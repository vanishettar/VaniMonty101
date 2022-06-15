package com.sgtesting.dataprovider;

	
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.DataProvider;
    import org.testng.annotations.Test;
	public class advancefirst 
	{

	

		public static WebDriver oBrowser=null; 
		@Test(priority=1)
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();

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
		
		@Test(priority=3) 
		private static void login1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(2000);
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
		@Test(priority=5)
		private static void createUsers()
		{
			try {
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("User1");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("email")).sendKeys("User1Demo1@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("username")).sendKeys("User1Demo1");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("UserDemo");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(2000);
				
				//create user2
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("User2");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("lastName")).sendKeys("Demo2");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("email")).sendKeys("User2Demo2@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("username")).sendKeys("User2Demo2");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("UserDemo");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(2000);
				
				//creation user3
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("User3");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("lastName")).sendKeys("Demo3");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("email")).sendKeys("User3Demo3@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("username")).sendKeys("User3Demo3");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("UserDemo");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		@Test(priority=6)
		private static void logout1()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
		@Test(priority=7)
		private  void loginAsUser1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User1Demo1");Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("UserDemo");Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=8)
		private static void logout2()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=9)
		private static void loginAsUser2()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User2Demo2");Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("UserDemo");Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(6000);
				oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(4000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=10)
		private static void logout3()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=11)
		private static void loginAsUser3()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User3Demo3");Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("UserDemo");Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(6000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=12)
		private static void logout4()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=13) 
		private static void login2()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=14)
		
		private static void modifyUsersPassword()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Demo1, User1']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("welcome");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(4000);
				
				oBrowser.findElement(By.xpath("//span[text()='Demo2, User2']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("welcome");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(4000);
				
				oBrowser.findElement(By.xpath("//span[text()='Demo3, User3']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("welcome");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=15)
		private static void logout5()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=16)
		private static void loginAsUser1SecondTime()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User1Demo1");Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome");Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(2000);
				//oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=17)
		private static void logout6()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=18)
		private static void loginAsUser2SecondTime()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User2Demo2");Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome");Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(4000);
				//oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(4000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=19)
		private static void logout7()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=20)
		private static void loginAsUser3SecondTime()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User3Demo3");Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("welcome");Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(4000);
				//oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(6000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=21)
		private static void logout8()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=22)
		private static void login3()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=23)
		private static void deleteUsers()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Demo1, User1']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
				Thread.sleep(2000);
				Alert oalert=oBrowser.switchTo().alert();
				String str=oalert.getText();
				System.out.println(str);
				oalert.accept();
				Thread.sleep(2000);Thread.sleep(2000);
				
				oBrowser.findElement(By.xpath("//span[text()='Demo2, User2']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
				Thread.sleep(2000);
				Alert oalert2=oBrowser.switchTo().alert();
				String str2=oalert2.getText();
				System.out.println(str2);
				oalert2.accept();
				Thread.sleep(2000);Thread.sleep(2000);
				
				oBrowser.findElement(By.xpath("//span[text()='Demo3, User3']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
				Thread.sleep(2000);
				Alert oalert3=oBrowser.switchTo().alert();
				String str3=oalert3.getText();
				System.out.println(str3);
				oalert3.accept();
				Thread.sleep(2000);Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=24)
		private static void logout9()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=25)
		private static void closeApplication()
		{
			try
			{
				Thread.sleep(2000);
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}



