package demoblazeExecute;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import demoblazeNawy.login;

public class loginExecute {
	WebDriver driver;
	login logIn;
  @Test (priority = 1, enabled = true)
  public void validLogin() throws InterruptedException {
	  
	  logIn.homelogin();
	  logIn.username("moamen1");
	  Thread.sleep(2000);
	  logIn.password("123");
	  Thread.sleep(2000);
	  logIn.loginBtn();
	  Thread.sleep(4000);
	  
  }
  @Test (priority = 2, enabled = true)
  public void invalidLoginbyusernameBlank() throws InterruptedException {
	
	logIn.homelogin();
	logIn.password("123");
	Thread.sleep(2000);
	logIn.loginBtn();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
    alert.accept();
  }
  @Test (priority = 3, enabled = true)
  public void invalidLoginbypassword() throws InterruptedException {
	logIn.homelogin();
	Thread.sleep(2000);
	logIn.username("moamen1");
	 Thread.sleep(2000);
	logIn.password("555");
	Thread.sleep(2000);
	logIn.loginBtn();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
    alert.accept();
  }
  @Test (priority = 4, enabled = true)
  public void invalidLoginbypasswordBlank() throws InterruptedException {
	logIn.homelogin();
	Thread.sleep(2000);
	logIn.username("moamen1");
	 Thread.sleep(2000);
	logIn.loginBtn();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
    alert.accept();
  }
  @Test (priority = 5, enabled = true)
  public void invalidLoginbyBlankdata() throws InterruptedException {
	logIn.homelogin();
	Thread.sleep(2000);
	logIn.loginBtn();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
    alert.accept();
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		logIn= new login(driver);
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
	  driver.quit();
  }
  
}
