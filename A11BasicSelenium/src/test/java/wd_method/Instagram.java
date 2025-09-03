package wd_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//                      driver = new EdgeDriver();
//                      driver = new FireFox`Driver();
		
		
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	}

}
