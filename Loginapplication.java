package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.Rediffloginpage;

public class Loginapplication {
	@Test
	public void login()
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\akshay.dm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 Rediffloginpage rd= new Rediffloginpage(driver);
		 rd.Emailid().sendKeys("hello");
		 rd.Passw().sendKeys("hey");
		 rd.Proced();
		
	}

}
