package SimplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPoints {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhi\\Documents\\vas\\jar files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		String expectedtitle="OrangeHRM";
		String actualtitle=driver.getTitle();
		
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		String expectedtext="Time at Work";
		String actualtext=driver.findElement(By.xpath("//p[text()='Time at Work']")).getText();
		if (actualtext.equals(expectedtext)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualURL=driver.getCurrentUrl();
		if (actualURL.equals(expectedURL)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		boolean logo=driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		System.out.println(logo);
		
		
		
		
		
	}

}


