package demoblazeExecute;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import demoblazeNawy.addCart;
import demoblazeNawy.login;

public class addcartExecute {
	WebDriver driver;
	login logIn;
	addCart Addcart;
  @Test (priority = 1, enabled = true)
  public void purhaseprocess() throws InterruptedException {
	  logIn.homelogin();
	  logIn.username("moamen1");
	  Thread.sleep(2000);
	  logIn.password("123");
	  logIn.loginBtn();
	  Thread.sleep(2000);
	  Addcart.nextBtn();
	  Thread.sleep(2000);
	  Addcart.item();
	  Thread.sleep(2000);
	  Addcart.add();
	  Thread.sleep(4000);
	  Alert alert = driver.switchTo().alert();
      alert.accept();
	  Thread.sleep(2000);
	  Addcart.cart();
	  Thread.sleep(2000);
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		logIn= new login(driver);
		Addcart =new addCart(driver);
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
