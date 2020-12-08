package MavenE2EJayashree.CucumberE2EProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotPwd_page_PageObjects {
	
	WebDriver driver;
	

By useremailInput=By.xpath("//input[@class='form-control string email optional']");
By submitBtn= By.xpath("//input[@type='submit']");



public forgotPwd_page_PageObjects(WebDriver driver) {
	this.driver=driver;
}
public WebElement getEmailInput() {
	
	return driver.findElement(useremailInput);
	
	
}
public WebElement getclickSubmitBtn() {
	
	return driver.findElement(submitBtn);
	
	
}




}
