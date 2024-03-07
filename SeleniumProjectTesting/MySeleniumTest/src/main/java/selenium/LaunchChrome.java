package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gazi\\Desktop\\SeleniumProjectTesting\\chromedriver.exe");
	//	C:\\Users\\Gazi\\Desktop\\SeleniumProjectTesting
	// or C:\\Users\\Gazi\\Desktop\\SeleniumProjectTesting\\chromedriver.exe
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

}
