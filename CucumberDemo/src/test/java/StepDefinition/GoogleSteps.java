package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Page.GoogleSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSteps extends GoogleSearchPage {

WebDriver driver=null;

	@Given("Open the browswer")
	public void open_the_browswer() {
    
//System.setProperty("webdriver.chrome.driver", "/Users/nasibausmanova/Downloads/drivers/chromedriver");

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*"); 

		driver = new ChromeDriver(options);
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		
		driver.navigate().to("https://www.google.com/");

	}

	@When("user enters a text in google search box")
	public void user_enters_a_text_in_google_search_box() {
		GoogleSearchPage.textbox_search(driver).sendKeys("Selenium free courses");
		//driver.findElement(By.name("q")).sendKeys("Selenium free courses");
	}

	@And("hits Enter")
	public void hits_enter() {
		GoogleSearchPage.hits_enter(driver).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the Search results")
	public void user_is_navigated_to_the_search_results() throws InterruptedException {
	    driver.getPageSource().contains("Selenium Fundamentals");
	    
	    
	    Thread.sleep(3000);
	    driver.quit();
		
	}

	}


