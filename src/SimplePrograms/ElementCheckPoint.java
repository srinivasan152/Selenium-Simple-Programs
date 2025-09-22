package SimplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCheckPoint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhi\\Documents\\vas\\jar files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Boolean checkpoint=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println(checkpoint);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Boolean checkpoint1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println(checkpoint1);
		Boolean checkpoint2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
		System.out.println(checkpoint2);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Boolean checkpoint3=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
		System.out.println(checkpoint3);
	}

}
