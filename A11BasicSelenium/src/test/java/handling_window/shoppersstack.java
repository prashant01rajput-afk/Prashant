package handling_window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		driver.get("https://www.shoppersstack.com/products_page/25");
		
		String pid=driver.getWindowHandle();
//		System.out.println(pid);
		
		driver.findElement(By.id("compare")).click();
		
		Thread.sleep(15000);
		Set<String> iDs=driver.getWindowHandles();
		
		for (String i : iDs) {
			driver.switchTo().window(i);
//			System.out.println(driver.getTitle());
			
			if (driver.getTitle().contains("Amozone"));
			driver.close();
			Thread.sleep(1000);
			driver.switchTo().window(pid);
			
		}
		driver.quit();
		
		
		
	}

}
