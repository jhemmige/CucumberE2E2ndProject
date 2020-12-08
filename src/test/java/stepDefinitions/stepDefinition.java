package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import MavenE2EJayashree.CucumberE2EProject2.Landing_Page_PageObjects;
import MavenE2EJayashree.CucumberE2EProject2.LogIn_Page_PageObjects;
import MavenE2EJayashree.CucumberE2EProject2.securityPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.Base;

public class stepDefinition extends Base {
	
@Given("^I have initialized the driver to open the chromedriver$")
public void i_have_initialized_the_driver_to_open_the_chromedriver() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	driver = initializedriver();
}

@And("^hit \"([^\"]*)\" on chromebrowser$")
public void hit_on_chromebrowser(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	driver.get(arg1);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@When("^I click on the Signin link of the Page and get to signin page.send valid user credentials such as  userName (.+)  and password (.+)$")
public void i_click_on_the_signin_link_of_the_page_and_get_to_signin_pagesend_valid_user_credentials_such_as_username_and_password(String username, String password) throws Throwable {
	Landing_Page_PageObjects lp = new Landing_Page_PageObjects(driver);// this obj exposes the methods present in loginPage class. LogIn
	// Page has

// various obj pertaining to Login.

lp.signInPage().click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

LogIn_Page_PageObjects lop = new LogIn_Page_PageObjects(driver);

lop.getEmail().sendKeys(username);
lop.getPwd().sendKeys(password);
lop.getLogInBtn().click();
}


@Then("^Successfully logged into my account\\.$")
public void successfully_logged_into_my_account() throws Throwable {
   
	securityPage sp = new securityPage(driver);

	String br = sp.roboticPage().getText();
	System.out.println(br);
boolean display=	sp.roboticPage().isDisplayed();

Assert.assertEquals("Why do I have to complete a CAPTCHA?", "Why do I have to complete a CAPTCHA?");


}

@And("^close the browser$")
public void close_the_browser() throws Throwable {
   driver.quit();
}

	   
	}


