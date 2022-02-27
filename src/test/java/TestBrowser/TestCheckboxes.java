package TestBrowser;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckboxes {
    
	public static String browser ="chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {
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
		driver.getTitle();	
		
		TestCheckboxes cb = new TestCheckboxes();
		cb.selectChkboxes();
		
		
	}
	
	public void selectChkboxes(){
		
		WebElement block = driver.findElement(By.xpath("//td[@class='mainIn']/div[4]"));
		List<WebElement> checkboxes = block.findElements(By.name("sports"));
		List<WebElement> brtags = block.findElements(By.tagName("br"));
		System.out.println("No. of checkboxes: " + checkboxes.size());
		System.out.println("No of BR tags :"+ brtags.size());
		
		for(int i=0; i<brtags.size();i++){	
			String text = brtags.get(i).getAttribute("innerHTML");
			System.out.println(text);
		}
		
	 //   String text = checkboxes.get(new Random().nextInt(checkboxes.size())).getText();
	    
	 //   System.out.println("The text is :"+ text);
	    
		checkboxes.get(new Random().nextInt(checkboxes.size())).click();
		
		if(checkboxes.get(new Random().nextInt(checkboxes.size())).isSelected()){
			String val =checkboxes.get(new Random().nextInt(checkboxes.size())).getAttribute("value");
			for(int i=0; i<brtags.size();i++){	
				String text = brtags.get(i).getText();
				System.out.println(text);
			
			  if(val.equalsIgnoreCase(text)){
				  System.out.println(text);			
			}
		   }
	    }
	}	

}
