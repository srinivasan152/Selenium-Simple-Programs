package SimplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelLogin {

	public static void main(String[] args) {
		DataDrivenFrameWork dd= new DataDrivenFrameWork();
		
		for (int i = 1; i <= 4 ; i++) {
			
			
			String us=dd.GetData("sheet1", i, 0);
			//System.out.println(us);
			String pw=dd.GetData("sheet1", i, 1);
			//System.out.println(pw);
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhi\\Documents\\vas\\jar files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys(us);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		driver.findElement(By.xpath("//p[text()='danielmandadaniel user']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}
		
		
	}

}
