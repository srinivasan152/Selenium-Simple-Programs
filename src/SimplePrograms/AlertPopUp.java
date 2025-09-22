package SimplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhi\\Documents\\vas\\jar files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		String ok=alt.getText();
		System.out.println(ok);
		alt.accept();
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		alt.dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		String oo=alt.getText();
		System.out.println(oo);
		alt.accept();
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alt.sendKeys("hi");
		Thread.sleep(2000);
		alt.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		String oi=alt.getText();
		System.out.println(oi);
		alt.accept();
	}

}
