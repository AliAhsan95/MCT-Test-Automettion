package browsersfactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	public WebDriver driver;

	public WebDriver OpenBrowser(String browserName) {
		if (browserName.equals("chrome")) {

			System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver" );
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

		}else if(browserName.equals("firefox")) {
			System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/drivers/geckodriver" );
WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();


		}
		driver.manage().window().maximize();
		return driver;
		
	}
	
	

	public void NavigettoWbpage(String webpageUrl) {
		// TODO Auto-generated method stub
		driver.get(webpageUrl);
	}
//	public void GetScrollBar(String horizontal,String vertical) {
//		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		//Scroll Down
//		jse.executeScript("window.scrollBy(0,550);");
//		
//		
//	}
	
}

 










