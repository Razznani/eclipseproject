package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","D:\\work\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://spicejet.com");
			driver.findElement(By.xpath("//*[@value='RoundTrip']")).click();
			System.out.println(driver.findElements(By.xpath("//*[@type='radio']")).size());
			driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
			driver.findElement(By.xpath("//a[@value='GOI']")).click();
			driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
			Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			s.selectByValue("5");
			driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_chk_Unmr\']")).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_chk_Unmr\']")).isSelected());
			
			
			
	}

}

