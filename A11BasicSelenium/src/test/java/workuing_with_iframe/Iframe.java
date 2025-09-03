package workuing_with_iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoqa.com/frames");
		 
		 driver.switchTo().frame("frame1");
		 WebElement we = driver.findElement(By.id("sampleHeading"));
		 System.out.println(we.getText());
		 
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame("frame2");
		 WebElement we1 = driver.findElement(By.id("sampleHeading"));
		 System.out.println(we1.getText());
		 
		 Thread.sleep(2000);
		driver.quit();
		
	}

}
