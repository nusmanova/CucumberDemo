package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
WebDriver driver= null;
	


@Given("user is on login page")
public void user_is_on_login_page() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/nasibausmanova/Downloads/drivers/chromedriver");
	ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*"); 
	driver = new ChromeDriver(options);
	driver.get("https://www.letskodeit.com/login");
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().window().maximize();
}

@When("user enters (.*) and (.*)")
public void user_enters_username_and_password() {
	
	driver.findElement(By.xpath("//form[@name='loginform']//input[@id='email']")).sendKeys("dipafrodita@gmail.com");
	driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("America2024$ ");

}


@And("clicks on login button")
public void clicks_on_login_button() {
	driver.findElement(By.xpath("//button[@id='login']")).click();
    
}
@Then("user succsessfully login and see information")
public void user_succsessfully_login_and_see_information() {
	System.out.println("user is on main page");
	
}


}
