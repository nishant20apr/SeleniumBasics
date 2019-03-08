package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) 
	{


		WebDriver driver = new FirefoxDriver(); //navigates to the Browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/guru99home/"); 
		// navigates to the page consisting an iframe

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		   String fid = js.executeScript("return document.domain;").toString();
		System.out.println(fid);
		//driver.switchTo().frame("a077aa5e"); //switching the frame by ID

		//System.out.println("********We are switch to the iframe*******");
		//driver.findElement(By.xpath("html/body/a/img")).click();
		//Clicks the iframe

		System.out.println("*********We are done***************");
	}

}
