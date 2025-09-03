package commondata.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GetDataFromPripertiesfiles {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rajpu\\eclipse-workspace\\vtiger-crm-framework-A11\\src\\test\\resources\\GetDataFrom.Properties");
		
		Properties pObj = new Properties();
		pObj.load(fis);
		
		
		String BROWSER = pObj.getProperty("bro");
		String URL = pObj.getProperty("url");
//		String USERNAME = pObj.getProperty("un");
//		String PASSWORD = pObj.getProperty("pwd");
		
		
		System.out.println("BROWSER");
		System.out.println("URL");
        System.out.println("USERNAME");
	    System.out.println("PASSWORD");
		
		WebDriver driver = null;
		
		if(BROWSER.equals("chrome")){
		driver = new ChromeDriver();
	}else if(BROWSER.equals("edge")) {
		driver = new EdgeDriver();
	} else if(BROWSER.equals("firefox")) {
		driver = new FirefoxDriver();
	} else {
		driver = new ChromeDriver();
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(URL);
		
		WebElement username = driver.findElement(By.name("user_name"));
		WebElement password = driver.findElement(By.name("user_password"));
		
		username.sendKeys("admin");
		password.sendKeys("manager");
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		
		
	
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}
}
