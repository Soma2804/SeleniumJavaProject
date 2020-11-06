package SelSpiceJetPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMultipleWindows {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/windows");
		//driver.findElement(By.xpath("//div[@id='content']/ul[1]/li[33]")).click();
		driver.manage().window().maximize();
		
		
		//Click to move to another window
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parentid =it.next();
		String childid =it.next();
		driver.switchTo().window(childid);
		String actualtitle1 = driver.getTitle(); 	
		System.out.println("After clicking on the required tab is " + actualtitle1);
		driver.switchTo().window(parentid);
		String actualtitle = driver.getTitle();
		System.out.println("Before clicking on the required tab is " + actualtitle);
		driver.close();
		driver.switchTo().window(childid).close();
	}

}
