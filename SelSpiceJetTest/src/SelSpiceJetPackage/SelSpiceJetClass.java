package SelSpiceJetPackage;

//import java.net.URL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelSpiceJetClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com"); // URL in the browser
		Thread.sleep(1000);
		//Select RadioButton
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Thread.sleep(1000);
		
		// Select Source and Destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		//Select highlighted day
		
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
	//WebElement dates= driver.findElement(By.cssSelector("table[class='ui-datepicker-calendar'] td[data-handler='selectDay']"));
		
	     //List<WebElement> dates =driver.findElement(By.cssSelector("table[class='ui-datepicker-calendar'] td[data-handler='selectDay']"));
	int count=driver.findElements(By.cssSelector("table[class='ui-datepicker-calendar'] td[data-handler='selectDay']")).size();
	
		for(int i=0;i<count;i++)
				{
				String text = driver.findElements(By.cssSelector("table[class='ui-datepicker-calendar'] td[data-handler='selectDay']")).get(i).getText();
				if(text.equalsIgnoreCase("22"))
				 {
					driver.findElement(By.cssSelector("table[class='ui-datepicker-calendar'] td[data-handler='selectDay']")).click();
					break;
				 } 
		//Verify if the 2nd Calender option is disabled when One-Way radiobutton is selectec
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{
			Assert.assertTrue(true);

		}

		else

		{
			Assert.assertTrue(false);

		}
		
		//Select checkboxes
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

		//Select Passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s1.selectByValue("2");
		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s2.selectByValue("USD");
		//Submit
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		//Print Page Title
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);

		// close Browser
		//driver.close();


	}

}
}
