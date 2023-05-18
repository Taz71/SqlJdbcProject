package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	DatabasePage dataBase;

	@Before
	public void beforeRun() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dataBase = new DatabasePage();
	}

//	@After
//	public void afterRun() {
//		tearDown();
//	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {

	}

	@When("User enters {string} from database")
	public void user_enters_from_database(String userData) {
		switch (userData) {
		case "usename":
			loginPage.enterUserName(dataBase.getData("usename"));
			System.out.println("userName from DB:" + dataBase.getData("usename"));
			break;
		case "password":
			loginPage.enterUserName(dataBase.getData("password"));
			System.out.println("password from DB:" + dataBase.getData("password"));
			break;
		default:
			System.out.println("Unable to extract user data:" + userData + " from DB");
		}
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	    loginPage.ClickOnSigninButton();
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {

	}

}
