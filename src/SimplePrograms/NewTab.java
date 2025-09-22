package SimplePrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhi\\Documents\\vas\\jar files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,600)", "");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> all=driver.getWindowHandles();
		Iterator<String>on=all.iterator();
		String one=on.next();
		String two=on.next();
		driver.switchTo().window(two);
		String four=driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println(four);
		driver.switchTo().window(one);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		driver.switchTo().window(two);
		
	}

}

