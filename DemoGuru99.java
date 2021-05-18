package guru99project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru99 
{
	ChromeDriver driver;
	String url="http://demo.guru99.com/v4/";
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:/@@@/Atul/Softwares/JARS/Selenium setup/Chromedriver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	public void login() throws InterruptedException
	{
		WebElement usernameElement=driver.findElement(By.name("uid"));
		usernameElement.sendKeys("mngr325531");
		driver.findElement(By.name("password")).sendKeys("gunuhuv");
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(2000);
		driver.close();
	}
	
}
