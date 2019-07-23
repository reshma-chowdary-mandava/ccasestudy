package cucu_casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class register {
	WebDriver driver=Utilityclass.startBrowser("chrome","http://10.232.237.143:443//TestMeApp//fetchcat.htm");
	
	@Given("^click on SignUp button$")
	public void click_on_SignUp_button() throws Throwable {
		// driver =Utilityclass.startBrowser("chrome","http://10.232.237.143:443/TestMeApp/fetchcat.htm"); 
		   System.out.println("User should not logged in");
          driver.findElement(By.partialLinkText("SignUp")).click();
	}

	@When("^User must enter all the below credentials$")
	public void user_must_enter_all_the_below_credentials() throws Throwable {
		System.out.println("User enters the beloe credentials");
	}

	@When("^Enter the username \"([^\"]*)\"$")
	public void enter_the_username(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^Enter the firstname \"([^\"]*)\"$")
	public void enter_the_firstname(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^Enter the lastname \"([^\"]*)\"$")
	public void enter_the_lastname(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^Enter the password \"([^\"]*)\"$")
	public void enter_the_password(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);

	}

	@When("^Enter the confirm Password \"([^\"]*)\"$")
	public void enter_the_confirm_Password(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);

	}

	@When("^select the gender \"([^\"]*)\"$")
	public void select_the_gender(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("^Enter the E-mail Id \"([^\"]*)\"$")
	public void enter_the_E_mail_Id(String arg1) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^Enter the phone no \"([^\"]*)\"$")
	public void enter_the_phone_no(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^Enter the dob \"([^\"]*)\"$")
	public void enter_the_dob(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(arg1);

	}

	@When("^Enter the Address \"([^\"]*)\"$")
	public void enter_the_Address(String arg1) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@When("^choose the \"([^\"]*)\"$")
	public void choose_the(String arg1) throws Throwable {
		driver.findElement(By.name("securityQuestion")).sendKeys(arg1);

	}

	@When("^Enter your fav pet \"([^\"]*)\"$")
	public void enter_your_fav_pet(String arg1) throws Throwable {
		driver.findElement(By.name("answer")).sendKeys(arg1);

	}

	@When("^User should click registration button$")
	public void user_should_click_registration_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();

	}

	@Then("^user must be in  login page$")
	public void user_must_be_in_login_page() throws Throwable {
		System.out.println("User must be in login page");
	}
}
