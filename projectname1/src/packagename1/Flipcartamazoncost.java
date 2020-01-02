package packagename1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipcartamazoncost {
	public class Flipcartamazon {
		WebDriver driver;
		@Test
		public void amazon() throws InterruptedException
		{
			
			 System.setProperty("webdriver.chrome.driver","E:\\ashok\\chromedriver.exe");
			 driver=new ChromeDriver(); 
			 
			 //lanch amazon site
			 driver.get("https://www.amazon.in/s?k");
			  
			  //type iphonex 64gb yellow
			 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone xr 64gb yellow");
			 Actions a=new Actions(driver);
			  for(int i=0;i<1; i++)
			  {
			a.sendKeys(Keys.DOWN).build().perform();
		    a.sendKeys(Keys.ENTER).build().perform();
			 Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']")).click();
				 Thread.sleep(3000);
				  
				  //swithto window/parent/child
		    String parentwindow=driver.getWindowHandle();
			 for(String childwindow:driver.getWindowHandles())
			 driver.switchTo().window(childwindow);
				  //get text of prize
			 String x=driver.findElement(By.xpath("//*[@id='priceblock_ourprice']")).getText();
			 System.out.print(x);
				 Thread.sleep(3000);
			  }
		      }
				 @BeforeTest
				 public void flipcart() throws InterruptedException
				 {
				System.setProperty("webdriver.chrome.driver","E:\\ashok\\chromedriver.exe");
				driver=new ChromeDriver(); 
					 
					//lanch flipcart site
				driver.get("https://www.flipkart.com/?gclid");
				if(driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).isDisplayed())
							 {
				 driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
					Thread.sleep(5000);
						 
						 //type iphonex 64gb yellow
				 driver.findElement(By.name("q")).sendKeys("iphone xr 64gb yellow");
				 Actions a=new Actions(driver);
						  for(int i=0;i<1; i++)
						  {
					 a.sendKeys(Keys.DOWN).build().perform();
					 a.sendKeys(Keys.ENTER).build().perform();
							  Thread.sleep(3000);
							  
							//get text of prize
					String x=driver.findElement(By.xpath("//*[@class='_1vC4OE _2rQ-NK']")).getText();
					System.out.print(x);
							 }
				 }
				
			  }
	}


}
