package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSourceCodeOfFlipKartWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.flipkart.com/");
		
		
		String S=driver1.getPageSource();
		System.out.println(S);

	}

}
