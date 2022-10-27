package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class LWCmensbottesting {

    DialogContent dc=new DialogContent();
    @Given("Open website go to home page")
    public void open_website_go_to_home_page() {
        WebDriver driver = GWD.getDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.switchTo().alert().dismiss();

    }
    @When("Verify that you are on the home page")
    public void verify_that_you_are_on_the_home_page() {
        dc.findAndContainsText("assertPage", "WAIKIKI");
    }
    @When("Go to Men's boots using the action class or with the help of the search button")
    public void go_to_men_s_boots_using_the_action_class_or_with_the_help_of_the_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click any Bot")
    public void click_any_bot() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click any Size")
    public void click_any_size() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on the addToCart")
    public void click_on_the_add_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on the Cart")
    public void click_on_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Save the product price")
    public void save_the_product_price() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on the Payment")
    public void click_on_the_payment() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Fill out the form on the payment page")
    public void fill_out_the_form_on_the_payment_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click on the save button")
    public void click_on_the_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
