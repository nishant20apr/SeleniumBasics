package selenium_basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 

		// Open URL
		driver.get("https://devbackend.yelowsoft.com/login");

		WebElement login_Email = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
		login_Email.sendKeys("admin@peerbits.com");
		WebElement login_Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		login_Password.sendKeys("rajesh@123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Peerbits')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		// Click on setting setting field
		driver.findElement(By.xpath("html/body/app-root/app-header/header/nav/div/ul[1]/li[9]/a")).click();

		// Dropdown code: To get the all fields of Setting 
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='dropdown open']//ul[@class='dropdown-menu']//li"));
		System.out.println(options);
		for(WebElement option : options) {
			System.out.println(option.getText());
			// TO select commission plan from setting dropdown		
			if (option.getText().equals("Commission Plan")) {
				option.click();
			}

		} 

	}

}
