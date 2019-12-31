package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import java.util.List;
import cucumber.api.DataTable;

import java.sql.SQLOutput;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^user has login information$")
    public void user_has_login_information() throws Throwable {
        System.out.println("log in page");
    }

    @When("^user log into the application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_log_into_the_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("username and password");
    }

    @Then("^user should be able log in successfully$")
    public void user_should_be_able_log_in_successfully() throws Throwable {
        System.out.println("log in successful");
    }

     @Given("^User is on Nissan OEM landing page$")
        public void user_is_on_nissan_oem_landing_page() throws Throwable {
            System.out.println("User in home page ");
        }

        @When("^User sign up with following details$")
        public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj=data.raw();
            System.out.println(obj.get(0).get(0));
            System.out.println(obj.get(0).get(1));
            System.out.println(obj.get(0).get(2));
            System.out.println(obj.get(0).get(3));
            System.out.println(obj.get(0).get(4));

        }

        @Then("^Home page should displayed$")
        public void home_page_should_displayed() throws Throwable {
            System.out.println("user successfully log in");

        }

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("login page");

    }

    @When("^User log in to application with (.+) and (.+)$")
    public void user_log_in_to_application_with_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

    @Then("^Home page will display$")
    public void home_page_will_display() throws Throwable {
        System.out.println("Home page display");

    }

    }


