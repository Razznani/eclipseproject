package first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	@Test

	public void face() 
	{
		properties prop=new properties();
		FileInputStream fis=new FileInputStream("C:\Users\Razz\eclipse-myworkspace\first\datadriven.properties");
		prop.load(fis);
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\work\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("username");
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
	driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	
	
	}

}


