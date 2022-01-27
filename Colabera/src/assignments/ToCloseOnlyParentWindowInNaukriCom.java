package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyParentWindowInNaukriCom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.close();
	}

}
