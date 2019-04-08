import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
	
	public static WebDriver driver;
	
	public WebDriver getDriver{
		
		System.setProperty("webdriver.chrome.driver","C:\\Suganya\\WindowsHandling\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public void Launch(Strng url) {
		driver.get(url);
	}
	public void type(WebElement ele ,String value) {
		ele.sendKeys(value);
	}

	public void Click(WebElement ele) {
		ele.click();
	

	}
	
}
