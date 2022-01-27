package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToswitchtheDriverControltoParticularWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		Set<String> allwindowIds=driver.getWindowHandles();
		String ExpectedWindowTitle="Tech Mahindra";
		for(String windowID: allwindowIds) {
			driver.switchTo().window(windowID);
			String actualWindowTitle=driver.getTitle();
		
		if(ExpectedWindowTitle.equals(actualWindowTitle)) {
			driver.manage().window().maximize();
			break;
		}
		}
	}
}

	


