package SimplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) {
		FirefoxProfile prof=new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip" );
		//prof.setPreference("browser.download.folderList", 0);
		prof.setPreference("browser.download.folderList", 2);
		prof.setPreference("browser.download.dir", "C:\\Users\\madhi\\Documents\\vas");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/downloads#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[text()='Download'])[2]")).click();
		
		
	}

}
