package assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseThidWindowInNaukriCom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		Set<String> allWindowIds=driver.getWindowHandles();
		String expectingWindowTitle= "Tech Mahindra";
		
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			String actualWindowTitle= driver.getTitle();
			if(expectingWindowTitle.equals(actualWindowTitle)) {
				Thread.sleep(3000);
				driver.close();
			
			}
				

	}

}
}
