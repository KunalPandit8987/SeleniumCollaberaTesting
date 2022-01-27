package takeScreenshots;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeScreenshotsOfWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/");
		File tempFile=driver.getScreenshotAs(OutputType.FILE);
	System.out.println(tempFile);
	File destFile= new File("./errorshots/screenshot1.png");
	tempFile.renameTo(destFile);
	File elementscreenshot=driver.findElement(By.xpath("//a[text()='Add restaurant']")).getScreenshotAs(OutputType.FILE);
	File elementdestFile= new File("./errorshots/screenshot2.png");
	elementscreenshot.renameTo(elementdestFile);
	}

}
