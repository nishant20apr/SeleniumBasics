package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class file_upload
{

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.websupergoo.com/file-upload-1.htm");
		driver.findElement(By.xpath(".//*[@id='page-content']/article/section/form/fieldset/input[1]")).sendKeys("C:\\Users\\nishant.kumar\\Desktop\\Sample websites for Selenium Practice.docx");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
	
	// http://cgi-lib.berkeley.edu/ex/fup.html   (Sample website link for fileupload )
	
	}

}
