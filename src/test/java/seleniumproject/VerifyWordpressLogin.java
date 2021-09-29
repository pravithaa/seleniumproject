package seleniumproject;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//import com.picnic.selenium2.LoginPage; //not needed bcoz this is in same package



public class VerifyWordpressLogin
{

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\pravithaas\\eclipse-workspace-selenium\\seleniumproject\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();



driver.manage().window().maximize();

driver.get("https://opensource-demo.orangehrmlive.com/");

LoginPage login=new LoginPage(driver);
login.typeUserName("Admin");
Thread.sleep(2000);
login.typePassword("admin123");
Thread.sleep(2000);







login.clickOnLoginButton();


driver.quit();

}


}