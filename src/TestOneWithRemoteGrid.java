

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestOneWithRemoteGrid {
	
	
	 static String username = "haritagr16";
	    static String accesskey = "KhRUhWBtSMg06DfGkKDY1khYNJm95695WV42HfaYPot7nqQfw6";
	    static RemoteWebDriver driver = null;
	    static String gridURL = "@hub.lambdatest.com/wd/hub";
	    static boolean status = false;
	    
//    static String username = "YOUR_USERNAME";
//    static String accesskey = "YOUR_ACCESS_KEY";
//    static RemoteWebDriver driver = null;
//    static String gridURL = "@hub.lambdatest.com/wd/hub";
//    static boolean status = false;
    

	public static void main(String[] args) {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "70.0");
        capabilities.setCapability("platform", "win10");
        capabilities.setCapability("build", "SeleniumJava");
        capabilities.setCapability("name", "LambdaTestJavaSample");
       
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }	
        
        
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
