package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanamicdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\work\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://delta.com");
			driver.findElement(By.xpath("//*[@id='srcCityLookup']")).click();
			driver.findElement(By.xpath(" //*[@id='stateProvince_ul']")).click();
			driver.findElement(By.xpath("//*[@id='stateProvinceAirport_ul']")).click();
			driver.findElement(By.xpath(" //*[@id='destCityLookup']")).click();
			;
			
			
			
			
			
			
			
			
			
	}

}
