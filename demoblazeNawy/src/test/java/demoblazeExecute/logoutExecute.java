package demoblazeExecute;

import org.testng.annotations.Test;
import demoblazeNawy.login;
import demoblazeNawy.logout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class logoutExecute {
	WebDriver driver;
	login logIn;
	logout logOut;
  @Test (priority = 1, enabled = true)
  public void logout() throws InterruptedException {
	  logIn.homelogin();
	  logIn.username("moamen1");
	  Thread.sleep(2000);
	  logIn.password("123");
	  logIn.loginBtn();
	  Thread.sleep(2000);
	  logOut.logOut();
	  Thread.sleep(2000);
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		logIn= new login(driver);
		logOut =new logout(driver);
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

