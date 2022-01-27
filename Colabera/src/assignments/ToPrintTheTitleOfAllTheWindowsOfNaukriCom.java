package assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintTheTitleOfAllTheWindowsOfNaukriCom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.Naukri.com/");
		Set<String> allWindowIds=driver1.getWindowHandles();
		for(String windowId:allWindowIds) {
			driver1.switchTo().window(windowId);
			String Titles=driver1.getTitle();
			System.out.println(Titles);
		
		
	}

}
}
