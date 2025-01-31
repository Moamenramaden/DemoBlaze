package demoblazeNawy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logout {
	WebDriver Driver;
	By logoutBtn = By.id("logout2");
	
		public logout(WebDriver Driver) {
			this.Driver= Driver;
		}
		
		public void logOut() {
			Driver.findElement(logoutBtn).click();
		}
}
