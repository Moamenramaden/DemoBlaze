package demoblazeExecute;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import demoblazeNawy.FakerUtil;
import demoblazeNawy.signin;

public class signupExecute {
	WebDriver driver;
	signin signup;
	FakerUtil faker;
  @Test (priority = 1, enabled = true)
  public void validRegistration() throws InterruptedException {
	  
      signup.signup();
      String username = FakerUtil.genrateUsername();
      signup.enterUsername(username);
      String password = FakerUtil.genratePassword();
      signup.enterPassword(password);
      Thread.sleep(2000);
      signup.register();
      Thread.sleep(2000);
      Alert alert = driver.switchTo().alert();
      alert.accept();
  }
  @Test (priority = 2, enabled = true)
  public void invalidRegistrationUsernameMissing() throws InterruptedException {
	  
      signup.signup();
      String password = FakerUtil.genratePassword();
      signup.enterPassword(password);
      Thread.sleep(2000);
      signup.register();
      Thread.sleep(2000);
      Alert alert = driver.switchTo().alert();
      alert.accept();
  }
  @Test (priority = 3, enabled = true)
  public void invalidRegistrationPasswordMissing() throws InterruptedException {
	  
      signup.signup();
      String username = FakerUtil.genrateUsername();
      signup.enterUsername(username);
      Thread.sleep(2000);
      signup.register();
      Thread.sleep(2000);
      Alert alert = driver.switchTo().alert();
      alert.accept();
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		signup= new signin(driver);
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
