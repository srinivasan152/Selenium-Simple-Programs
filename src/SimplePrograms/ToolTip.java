package SimplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhi\\Documents\\vas\\jar files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/u-s-crown-hy320-mini-4k-support-android-13-wifi-6-bt-5-0-2gb-16gb-auto-keystone-5000-lm-1-speaker-wireless-remote-controller-portable-projector/p/itme01ef076c4f94?pid=PROHEYFTGYBSZE3N&lid=LSTPROHEYFTGYBSZE3NGZGGFH&marketplace=FLIPKART&store=6bo%2Ftia%2F1hx&srno=b_1_1&otracker=browse&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L2_view-all&fm=organic&iid=en_QthK_Tnh8iwccXhI-S61Fp8pLWGz7aVhe44h3eVBq3317a28WjhuRe6VsdZycul1hv4usAY3Wx-x34TPDwNR2Q%3D%3D&ppt=browse&ppn=browse&ssid=uybzbc986o0000001758264369468");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("(//span[@class='question'])[1]")).click();
		String onr=driver.findElement(By.xpath("//div[@class='-Hj6CQ']")).getText();
		System.out.print(onr);
		
		
		//div[@class='-Hj6CQ']
		
	}

}
