package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitleAndUrlOfFlipKartWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.flipkart.com/");
		String T=driver1.getTitle();
		System.out.println(T);
		
		String U=driver1.getCurrentUrl();
		System.out.println(U);
		
		

	}

}
