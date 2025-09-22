package SimplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Democlass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhi\\Documents\\vas\\jar files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.get("https://www.krninformatix.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		WebElement one=driver.findElement(By.xpath("//a[text()='Courses Offered']"));
		Actions act=new Actions(driver);
		act.moveToElement(one).perform();
		
		
		
		
	}

}
