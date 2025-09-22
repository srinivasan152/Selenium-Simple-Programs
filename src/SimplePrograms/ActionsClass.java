package SimplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhi\\Documents\\vas\\jar files\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement move=driver.findElement(By.xpath("//a[text()='Services']"));
		Actions act=new Actions(driver);
		act.moveToElement(move).perform();
		driver.findElement(By.xpath("//a[text()='Classroom Training']")).click();
		driver.findElement(By.xpath("//a[text()='Weekday classes']")).click();
		driver.navigate().back();
		driver.navigate().back();
		WebElement move1=driver.findElement(By.xpath("//a[text()='Branches']"));
		act.contextClick(move1).perform();
		for (int i = 0; i < 4; i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();

		}
		

		act.sendKeys(Keys.ENTER).perform();
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		
		
		
	}

}
