package demoblazeNawy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signin {
	WebDriver driver;
	By signinHome = By.id("signin2");
	By userName = By.id("sign-username");
	By password = By.id("sign-password");
	By signUp = By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary");
	
	 public signin(WebDriver driver) {
	        this.driver = driver;
	}
	public void signup() {
		driver.findElement(signinHome).click();
	}
	public void enterUsername (String username) {
		driver.findElement(userName).sendKeys(username);
	}
	public void enterPassword (String Password) {
		driver.findElement(password).sendKeys(Password);
	}
	public void register() {
		driver.findElement(signUp).click();
	}
	
}
