package org.example;

import PageObjects.Enrollment;
import PageObjects.WebsiteMainPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class StepDefinitions {
    private final WebDriver driver = new ChromeDriver();

    private WebsiteMainPage mainPage;
    private Enrollment enrollment;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new WebsiteMainPage(driver);
        enrollment = new Enrollment(driver);
    }

    @Given("I am on the mainpage")
    public void i_am_on_the_mainpage() {
        driver.get("file:///C:/Users/Bogdan/Desktop/Testing-Env/index.html");
    }

    @When("I click on the Start the Enrollment button")
    public void i_click_on_the_start_the_enrollment_button() {
        mainPage.clickOnEnrollmentButton();
    }

    @Then("The page title should start with {string}")
    public void the_page_title_should_start_with(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }

    @When("I click the Read More button of fundamentals area")
    public void i_click_the_read_more_button_of_fundamentals_area() {
        Utils.scrollToElement(driver, mainPage.getScrollToLearnTheFundamentals());
        mainPage.clickOnReadMoreButton();
    }

    @When("I enter {string}")
    public void i_enter_a_email_adress(String string) {
        mainPage.inputEmail(string);
    }

    @Then("A pop-up should appear and confirm the subscription")
    public void a_pop_up_should_appear_and_confirm_the_subscription() {
    }

    @When("I click on the Instructor Button in the top right corner")
    public void i_click_on_the_instructor_button_in_the_top_right_corner() {
        mainPage.clickOnInstructorsButton();
    }

    @Then("The page should take me to the Instructors Area")
    public void the_page_should_take_me_to_the_instructors_area() {
        Utils.scrollToElement(driver, mainPage.getScrollToInstructors());
    }

    @When("I scroll to instructors area")
    public void i_scroll_to_instructors_area() {
        Utils.scrollToElement(driver, mainPage.getScrollToInstructors());
    }

    @When("click on Steve Smith's linkedIn button")
    public void click_on_steve_smith_s_linked_in_button() {
        this.mainPage.clickOnLinkedInButton();
    }

    @Then("The page should take me to {string} site")
    public void the_page_should_take_me_to_linked_in_site(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }
    @When("I scroll to the bottom of the page")
    public void i_scroll_to_the_bottom_of_the_page() { Utils.scrollToElement(driver , mainPage.getScrollToBottom()); }
    @When("click on return to top button")
    public void click_on_return_to_top_button() {
        mainPage.clickOnReturnToTopButton();
    }
    @Then("the page should return to top")
    public void the_page_should_return_to_top() { Utils.scrollToElement(driver , mainPage.getScrollToTop());
    }
    @And("click on Sara Smith's twitter button")
    public void click_on_sara_smith_s_twitter_button() { this.mainPage.clickOnTwitterButton(); }


    // Enrollment page steps starts below
    @When("press the next button")
    public void press_the_next_button() {
        enrollment.clickOnNextButton();
    }

    @Then("the header of the page will be {string}")
    public void the_header_of_the_page_will_be(String string) {
        Assert.assertTrue(driver.getPageSource().contains(string));
    }
    @When("I fill the first name field with {string}")
    public void i_fill_the_first_name_field_with(String string) {
        enrollment.enterFirstName(string);
    }
    @And("last name field with {string}")
    public void last_name_field_with(String string) {
        enrollment.enterLastName(string);
    }
    @And("username field with {string}")
    public void username_field_with(String string) { enrollment.enterUsername(string); }
    @And("password field with {string}")
    public void password_field_with(String string) {
        enrollment.enterPassword(string);
    }
    @And("confirm password with {string}")
    public void confirm_password_with(String string) {
        enrollment.enterPassword(string);
    }
    @Then("the header of the next page will be {string}")
    public void the_header_of_the_next_page_will_be(String string) {
        Assert.assertTrue(driver.getPageSource().contains(string));
    }
    @Given("I am on the Contact information page")
    public void i_am_on_the_contact_information_page() {
        driver.get("file:///C:/Users/Bogdan/Desktop/Testing-Env/routes/enrollment.html");
        enrollment.enterFirstName("Bogdan");
        enrollment.enterLastName("George");
        enrollment.enterUsername("BGD");
        enrollment.enterPassword("abc");
        enrollment.confirmPassword("abc");
        enrollment.clickOnNextButton();
    }
    @When("I fill the email field with {string}")
    public void i_fill_the_email_field_with(String string) {
        enrollment.enterEmailField(string);
    }
    @And("phone field with {string}")
    public void phone_field_with(String string) {
        enrollment.enterphoneField(string);
    }
    @And("country field with {string}")
    public void country_field_with(String string) {
        enrollment.enterCountryField(string);
    }
    @And("city field with {string}")
    public void city_field_with(String string) {
        enrollment.enterCityField(string);
    }
    @And("postcode field with {string}")
    public void postcode_field_with(String string) {
        enrollment.enterPostCodeField(string);
    }
    @After
        public void closeBrowser (Scenario scenario){
            if (scenario.isFailed()) {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "name");
            }
            driver.quit();

        }
    }

