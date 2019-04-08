import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {
	static WebDriver driver;
	   Base b = new Base();
	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	 WebDriver driver = b.getDriver();
	   b.Launch("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user fill in the customer details")
	public void the_user_fill_in_the_customer_details() {
		
	   
	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
	  WebElement s = driver.findElement(By.name("submit"));
	  b.Click(s);
	   
	}

	@Then("The user should see the Error message")
	public void the_user_should_see_the_Error_message() {
	   Alert al = driver.switchTo().alert();
	   al.accept();
	   Assert.assertTrue(driver.findElement(By.name("submit")).isDisplayed();
	}


}
