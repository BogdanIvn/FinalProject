package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebsiteMainPage {
    public WebElement getScrollToInstructors;
    public WebsiteMainPage(WebDriver driver) { PageFactory.initElements(driver, this);}
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrollmentButton;
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement ReadMoreButton;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement ScrollToLearnTheFundamentals;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailBox;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsButton;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[3]/div/div")
    private WebElement scrollToInstructors;

    @FindBy (xpath = "//*[@id=\"instructors\"]/div/div/div[3]/div/div/a[3]/i")
    private WebElement linkedInButton;

    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement returnToTopButton;

    @FindBy(xpath ="/html/body/footer")
    private WebElement scrollToBottom;

    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement scrollToTop;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[4]/div/div/a[1]/i")
    private WebElement twitterButton;

    public void clickOnEnrollmentButton() { this.enrollmentButton.click();}
    public void clickOnReadMoreButton() {this.ReadMoreButton.click();}

    public WebElement getScrollToLearnTheFundamentals() {return this.ScrollToLearnTheFundamentals; }
    public void clickOnSubmitButton(){
        this.submitButton.click();
    }
    public void inputEmail(String email) {
        this.emailBox.sendKeys(email);
        this.clickOnSubmitButton();
    }
    public void clickOnInstructorsButton(){ this.instructorsButton.click(); }
    public WebElement getScrollToInstructors() { return this.scrollToInstructors; }
    public void clickOnLinkedInButton(){
        this.linkedInButton.click();
    }
    public void clickOnReturnToTopButton(){ this.returnToTopButton.click(); }
    public WebElement getScrollToBottom(){ return this.scrollToBottom; }
    public WebElement getScrollToTop(){ return this.scrollToTop; }
    public void clickOnTwitterButton(){ this.twitterButton.click(); }

    }



