package wd_methods1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLine1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//                      driver = new EdgeDriver();
//                      driver = new FireFox`Driver();
		
		
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
//	System.out.println(driver.getTitle());
//  System.out.println(driver.getCurrentUrl());
	
//  driver.findElement(By.xpath("//span[text()='Meta']")).click();

	Thread.sleep(3000);
	
	
//  driver.close();
	driver.quit();

	
	}
}
