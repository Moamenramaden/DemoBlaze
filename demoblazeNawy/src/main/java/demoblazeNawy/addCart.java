package demoblazeNawy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addCart {
	WebDriver Driver;
	By nextbtn = By.id("next2");
	By item = By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4 > a");
	By add = By.cssSelector("#tbodyid > div.row > div > a");
	By cartbtn = By.id("cartur");
		public addCart(WebDriver Driver) {
			this.Driver=Driver;
		}
		public void nextBtn() {
			Driver.findElement(nextbtn).click();
		}
		public void item() {
			Driver.findElement(item).click();
		}
		
		public void add() {
			Driver.findElement(add).click();
		}
		public void cart() {
			Driver.findElement(cartbtn).click();
		}
}
