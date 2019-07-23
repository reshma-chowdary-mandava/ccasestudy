package cucu_casestudy;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	
@Given("^User must be on testMe app and clicks Signin button$")
public void user_must_be_on_testMe_app_and_clicks_Signin_button() throws Throwable {
   System.out.println("User must be in login page");
   driver=Utilityclass.startBrowser("chrome","http://10.232.237.143:443//TestMeApp//fetchcat.htm");
}

@When("^User Enters <username> and <passsword>$")
public void user_Enters_username_and_passsword(DataTable arg1) throws Throwable {
	List<Map<String,String>> arg2=arg1.asMaps(String.class, String.class);
	for(int itr=0;itr<arg2.size();itr++)
	{
		  System.out.println(arg2.get(itr).get("username")+"\t"+arg2.get(itr).get("password"));
		 
		  driver.findElement(By.partialLinkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys(arg2.get(itr).get("username"));
		  driver.findElement(By.name("password")).sendKeys(arg2.get(itr).get("password"));
		  Thread.sleep(2000);
		  driver.findElement(By.name("Login")).click();
		
	}
	
}

@Then("^User must be Logged in$")
public void user_must_be_Logged_in() throws Throwable {
	Assert.assertEquals(driver.getTitle(),"Home");
	System.out.println("User Logged in successfully");
}

}
