package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToResizeTheWindowTo100WidthAnd200Height {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com/");
		Dimension dimension = new Dimension(100,200);//Inorder to set the size of wep page.
		driver1.manage().window().setSize(dimension);

	}

}
