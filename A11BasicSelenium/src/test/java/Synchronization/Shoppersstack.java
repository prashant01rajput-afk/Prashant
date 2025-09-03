package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstack {
	  public static void main(String[]args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
		  driver.get("https://www.shoppersstack.com/");
		  Thread.sleep(2000);
		 
		  
		  
	  }

}
