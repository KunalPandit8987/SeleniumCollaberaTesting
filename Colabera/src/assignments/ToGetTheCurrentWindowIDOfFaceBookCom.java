package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheCurrentWindowIDOfFaceBookCom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.FaceBook.com/");
	Rectangle dimension=driver.findElementById("email").getRect();
	int height=dimension.getHeight();
	int witdh=dimension.getWidth();
	System.out.println("height of eml textfield"+height+"and witdh is"+witdh);

	Rectangle dimension1=driver.findElementById("passContainer").getRect();
	int height1=dimension1.getHeight();
	int witdh1=dimension1.getWidth();
	System.out.println("height of pwd textfield"+height1+" and witdh is"+witdh1);

	}

}
