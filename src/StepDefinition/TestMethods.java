package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMethods {
	
	WebDriver driver;
	
	@Given("^I am on bbc website$")
	public void toNavigateToBbc() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://www.bbc.co.uk/");
		driver.manage().window().maximize();
	}

	@When("^I navigate to \"([^\"]*)\"$")
	public void toClickOnLink(String link) throws Throwable {
		driver.findElement(By.xpath(link)).click();
	}

	@Then("^I check page title is \"([^\"]*)\"$")
	public void checkPageTitle(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	}

	@And("^I close the browser$")
	public void closeBrowser() throws Throwable {
	    driver.close();
	}
	
	//below step definitions used without parameters
	
	/*@Given("^I am on bbc website$")
	public void I_am_on_bbc_website() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://www.bbc.co.uk/");
		driver.manage().window().maximize();
	}

	@When("^I navigate to News$")
	public void I_navigate_to_News() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='orb-nav-links']/ul/li[1]/a")).click();
	}

	@Then("^I check page title is news$")
	public void I_check_page_title_is_bbc_news() throws Throwable {
	    Assert.assertTrue(driver.getTitle().contains("News"));
	}

	@And("^I close the browser$")
	public void I_close_the_browser() throws Throwable {
	   driver.close();
	}

	@When("^I navigate to Sport$")
	public void I_navigate_to_Sport() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='orb-nav-links']/ul/li[2]/a")).click();
	}

	@Then("^I check page title is BBC Sport$")
	public void I_check_page_title_is_BBC_Sport() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Sport"));
	}

	@When("^I navigate to Weather$")
	public void I_navigate_to_Weather() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='orb-nav-links']/ul/li[3]/a")).click();

	}

	@Then("^I check page title is BBC Weather$")
	public void I_check_page_title_is_BBC_Weather() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("Weather"));
	}*/

}
