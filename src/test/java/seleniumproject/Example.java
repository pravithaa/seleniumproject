package seleniumproject;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class Example {
    
    /**
     * @param args
     * @throws InterruptedException
     */
    //public static void main (String[] args) throws InterruptedException {
	@Test
	
	
	public void Example() throws InterruptedException {
	
	
	
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\pravithaa\\eclipse-workspace_Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\pravithaa\\eclipse-workspace_Selenium\\SeleniumProject\\drivers\\geckodriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
            
        //Thread.sleep(5000);
        driver.close();
    }
}

 

        