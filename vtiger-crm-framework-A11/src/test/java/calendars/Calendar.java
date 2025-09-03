package calendars;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
		WebElement username = driver.findElement(By.name("user_name"));
		WebElement password = driver.findElement(By.name("user_password"));
		
		
		
		username.sendKeys("admin");
		password.sendKeys("manager");
		
	 driver.findElement(By.id("submitButton")).click();
	 
	  driver.findElement(By.linkText("Calendar")).click();
	  driver.findElement(By.linkText("Year")).click();
	  driver.findElement(By.linkText("Month")).click();
	  driver.findElement(By.linkText("Week")).click();
	  driver.findElement(By.linkText("Day"));
	  
	  
//	  Select sel = new Select(s1);
	  
	  driver.findElement(By.linkText("Sign Out")).click();
	  
	  Thread.sleep(2000);
	  driver.quit();
	}

}
