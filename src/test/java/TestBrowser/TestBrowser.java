package TestBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static String browser ="chrome";
	public static WebDriver driver;
    
	@Test
	public void runBrowser(){
		
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("edge")){
			     WebDriverManager.edgedriver().setup();
			     driver = new EdgeDriver();
		      }else if(browser.equals("firefox")){
			        WebDriverManager.firefoxdriver().setup();
			        driver = new FirefoxDriver();
		      		}
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println("Browser is launched");
		
		
		
		
	}	
		
	
		
	
}
