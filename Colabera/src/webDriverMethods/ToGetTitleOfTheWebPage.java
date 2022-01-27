package webDriverMethods;


	import org.openqa.selenium.chrome.ChromeDriver;
	public class ToGetTitleOfTheWebPage {
	

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver1=new ChromeDriver();
			driver1.get("https://www.zomato.com/");
			String T=driver1.getTitle();
			System.out.println(T);
			
	}

}
