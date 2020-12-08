package MavenE2EJayashree.CucumberE2EProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class securityPage {
	
	WebDriver driver;
	
	
By captChaPage=	By.xpath("//*[text()='Why do I have to complete a CAPTCHA?']");

	public securityPage(WebDriver driver) {
	
		this.driver=driver;
}

	public WebElement roboticPage() {
		
	 return driver.findElement(captChaPage);
		
		
	}

}
