package pom;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNew {
	
	static WebDriver driver; 
	
	@BeforeMethod
	
	public void beforeMethod() {
    
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakan\\Desktop\\chromedriver94.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

    driver.get("https://petclincqpros.herokuapp.com/");
}
	
	@AfterMethod 
		public void aftermethod() {
			this.driver.quit();
		}
	}



