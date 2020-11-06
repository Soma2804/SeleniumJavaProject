package TestOHRMPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOHRMClass {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOHRMClass obj = new TestOHRMClass();
		obj.OHRMLaunch();
	}
	
	public static void OHRMLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String OHRMUrl = "https://opensource-demo.orangehrmlive.com/";
		driver.get(OHRMUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		String Password = "admin123";
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(Password);
		// driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.cssSelector("#btnLogin")).click();
		//driver.manage().window().maximize();
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		// Click on the OrangeHRM icon
		driver.findElement(By.xpath("//*[@id='branding']/a[1]/img")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parentid =it.next();
		String childid =it.next();
		driver.switchTo().window(childid);
		String actualtitle1 = driver.getTitle(); 	
		System.out.println(actualtitle1);
		driver.switchTo().window(parentid);
		System.out.println(actualtitle);
		
	}
	

}
