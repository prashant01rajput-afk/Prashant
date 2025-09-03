 	package Working_with_js;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	
		
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		
		jse.executeScript("window.location='https://www.zomato.com/';");
		
		System.out.println(jse.executeScript("return document.title;"));
		Thread.sleep(1000);
		 
		driver.quit();



	}
}
