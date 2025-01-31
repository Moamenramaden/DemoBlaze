package demoblazeNawy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	By homelogin = By.id("login2");
	By username = By.id("loginusername");
	By password = By.id("loginpassword");
	By loginBtn = By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary");
	
public login (WebDriver driver) {
	this.driver=driver;
	}
public void homelogin() {
	driver.findElement(homelogin).click();
	}
public void username (String userName) {
	driver.findElement(username).sendKeys(userName);
	}
public void password (String passWord) {
	driver.findElement(password).sendKeys(passWord);
	}
public void loginBtn() {
	driver.findElement(loginBtn).click();
}
}
