package Working_with_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
//		
//		WebElement un = driver.findElement(By.id("email"));
//		un.sendKeys("prashant");
//		
//		Thread.sleep(2000);
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("1234567");
//		
//		Thread.sleep(2000);
//		WebElement  button = driver.findElement(By.name("login"));
////		button.click();
//		button.submit();
		
		WebElement createAcc=driver.findElement(By.linkText("Create new account"));
		createAcc.click();
		driver.findElement(By.xpath("//label[text()='Male']/input")).click();
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
