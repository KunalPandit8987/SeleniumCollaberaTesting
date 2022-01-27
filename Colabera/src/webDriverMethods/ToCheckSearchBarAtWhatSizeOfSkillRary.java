package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckSearchBarAtWhatSizeOfSkillRary {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		//Dimension dimension = driver.manage().window().getSize();
		//int Height=(int) dimension.getHeight();
		//int Width=(int) dimension.getWidth();
		//System.out.println("Height"+Height+"and Width"+Width);//Inorder to check the size of wep page.
		Dimension dimension = new Dimension(1212,1050);//Inorder to set the size of wep page.
		driver.manage().window().setSize(dimension);

	}

}
