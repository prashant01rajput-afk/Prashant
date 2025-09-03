package working_with_demowebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		WebElement butn =driver.findElement(By.cssSelector("button[id='alertButton']"));
		butn.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
//   	driver.findElement(By.cssSelector("button[id='alertButton']")).click();
		WebElement butn1 =driver.findElement(By.cssSelector("button[id='timerAlertButton']"));
	
		butn1.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement butn2 =driver.findElement(By.cssSelector("button[id='confirmButton']"));
		butn2.click();
		driver.switchTo().alert().sendKeys("prashant");	
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
