package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deltadropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\work\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://delta.com");
			driver.findElement(By.xpath("//*[@id='paxCount-button']")).click();
			driver.findElement(By.xpath("//*[@id='ui-id-10']")).click();
			

	}

}
