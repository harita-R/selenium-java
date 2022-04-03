import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;				
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();		    

        //Maximize window		
        driver.manage().window().maximize();	
        
        //Launching the Site.		
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        //Login to site 		
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");					
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");	
        driver.findElement(By.name("Submit")).click();   
        
        //Close browser
        driver.quit();	       		
	}
}
