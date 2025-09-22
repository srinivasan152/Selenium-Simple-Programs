package SimplePrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDroupDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhi\\Documents\\vas\\jar files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement multiselect=driver.findElement(By.id("multi-select"));
		Select dd=new Select(multiselect);
		dd.selectByIndex(0);
		dd.selectByValue("New Jersey");
		dd.selectByVisibleText("Ohio");
		dd.selectByIndex(1);
		Thread.sleep(3000);
		dd.deselectByIndex(1);
		Thread.sleep(3000);
		
		List<WebElement> sel=dd.getAllSelectedOptions();
		int allsel=sel.size();
		for (int i = 0; i < allsel; i++) {
			WebElement val=sel.get(i);
			String ss=val.getText();
			System.out.println(ss);
		}
		List<WebElement> se=dd.getOptions();
		int alsel=se.size();
		for (int i = 0; i < alsel; i++) {
			WebElement va=se.get(i);
			String s=va.getText();
			System.out.println(s);
		}
	}

}
