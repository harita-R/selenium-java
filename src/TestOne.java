import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;				
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();		    

        //Maximize window		
        driver.manage().window().maximize();	
        
        //Launch the Site.		
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        
        //Enter values into form and submit
        
        driver.findElement(By.id("sum1")).sendKeys("2");					
        driver.findElement(By.id("sum2")).sendKeys("5");	
        driver.findElement(By.xpath("//*[@id='gettotal']/button")).click();  
        
        //Verify the result
        String result = driver.findElement(By.xpath("//*[@id=\'addmessage\']")).getText();
        
        if( Integer.parseInt(result) == 7) {
        	 System.out.println("Test Success");
        } else {
        	 System.out.println("Test Failed - " + result);
        }                
        
        //Close the browser
        driver.quit();	       		
	}
}
