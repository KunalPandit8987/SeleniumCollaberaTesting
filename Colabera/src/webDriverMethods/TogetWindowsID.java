package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class TogetWindowsID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		String window=driver.getWindowHandle();
		System.out.println(window);

	}

}
