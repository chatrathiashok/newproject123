package packagename1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tripadvisor {
	WebDriver driver;
	@Test
	public void lanchtripadvisor() throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver","E:\\ashok\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 //lanch the site
			 driver.get("https://www.tripadvisor.in/");
			Thread.sleep(4000);
             Actions a=new Actions(driver);
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@class='ui_icon search brand-global-nav-action-search-Search__icon--2DVjd']")).click();
                      
          //search for club mahindra
            driver.findElement(By.xpath("//*[@class='text']")).sendKeys("club mahindra");
            
            //click on first result
            driver.findElement(By.xpath("//*[@id='SEARCH_BUTTON_CONTENT']")).click();
            
            //click on write Review
            Thread.sleep(3000);
             driver.findElement(By.xpath("//*[@alt='4.5 of 5 bubbles']")).click();
            
            //switch to window parent/child
              String parentwindow=driver.getWindowHandle();
			  for(String childwindow:driver.getWindowHandles())
				  driver.switchTo().window(childwindow);
			  
			 driver.findElement(By.xpath("//*[@class='ui_button primary']")).click();
			 for(String childwindow1:driver.getWindowHandles())
			 driver.switchTo().window( childwindow1);
			  
			//your overall rating
			WebElement e=driver.findElement(By.xpath("//*[@onclick='ta.userreview.common.trackFieldFocus(this)']"));
			a.moveToElement(e).click().build().perform();
			
			 //title of your review
            driver.findElement(By.name("ReviewTitle")).sendKeys("excellent");
			  
			  
			//your review
			driver.findElement(By.name("ReviewText")).sendKeys("assdddddhhhhhhhhhhhhhhhhhhhhhhhhhhhjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjojffjsrhhhhhhiodccihhjhhjhhjjhhhkjkjkjkjjkjjjkjjjjjbbbbbbbbbbbjbjx bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbhhjjjijijjijifjcjvfvjoiavjvjvdiijvjivjasvijhhh");
			
			//scroll webpages
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-500)");
			
			//click what sort of trip was this			
			driver.findElement(By.xpath("//*[@data-category='Business']")).click();
			js.executeScript("window.scrollBy(0,-500)");
			//click on when did you travel
			
			WebElement e1=driver.findElement(By.xpath("//*[@name='trip_date_month_year']"));
			a.click(e1).build().perform();
			for(int i=0;i<1; i++)
			{
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.ENTER).build().perform();
				 
				//scroll webpage
				js.executeScript("window.scrollBy(0,-800)");
				//click on submit your review tick mark
				WebElement e2=driver.findElement(By.xpath("//*[@type='checkbox']"));
				a.click(e2).build().perform();
				 
				 // click on submit your review
                 driver.findElement(By.id("SUBMIT")).click();
			}
	}
}
