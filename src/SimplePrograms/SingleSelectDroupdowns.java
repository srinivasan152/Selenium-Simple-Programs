package SimplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDroupdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhi\\Documents\\vas\\jar files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,500)",""); 
				
		
		WebElement singleselect=driver.findElement(By.id("fruits"));
		Select dd=new Select(singleselect);
		dd.selectByIndex(2);
		Thread.sleep(3000);
		dd.selectByValue("3");
		Thread.sleep(3000);
		dd.selectByVisibleText("Pine Apple");


		
		
		
		
	}

}
