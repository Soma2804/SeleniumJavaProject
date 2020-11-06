package SelSpiceJetPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestNestedFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://bridgecrew.io//");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver = driver.findElement(By.tagName("footer"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement columnDriver = driver.findElement(By.id("nav_menu-2"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		for(int i=0;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String ClickonLinkTabs =Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonLinkTabs);
			Thread.sleep(4000);	
		}
		
		//Read data from each page
		Set<String> pageText = driver.getWindowHandles();
		Iterator<String> it=pageText.iterator();
		
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
			}
		
		
		//int noofFrames= driver.findElements(By.xpath("//frame[@name='frame-middle']")).size();
		//System.out.println("Total Frames --" + noofFrames);
		//driver.switchTo().frame(0);
		//System.out.println(driver.findElement(By.xpath("//frame[@name='frame-middle']")).getText());
		//System.out.println(driver.findElements(By.xpath("//frame[@name='frame-middle']")).getText());
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		//System.out.println (driver.findElement(By.xpath("/html/frameset/frame[1]")).getText());
		//driver.findElement(By.xpath("//frame[@src='/frame_middle']")).getText();
		//driver.switchTo().defaultContent();
		//driver.close();*/
		}

}
