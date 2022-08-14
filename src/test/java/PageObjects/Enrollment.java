package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enrollment {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userName;

    @FindBy(xpath ="//*[@id=\"password\"]")
    private WebElement passWord;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPassword;

    //

    @FindBy(xpath= "//*[@id=\"email\"]")
    private WebElement emailField;

    @FindBy(xpath="//*[@id=\"phone\"]")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement countryField;

    @FindBy(xpath ="//*[@id=\"city\"]")
    private WebElement cityField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postCodeField;


    public Enrollment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickOnNextButton(){ this.nextButton.click(); }
    public void enterFirstName(String firstName){ this.firstName.sendKeys(firstName);}
    public void enterLastName(String lastName){ this.lastName.sendKeys(lastName);}
    public void enterUsername(String userName){ this.userName.sendKeys(userName);}
    public void enterPassword(String passWord){ this.passWord.sendKeys(passWord);}
    public void confirmPassword(String confirmPassword){ this.confirmPassword.sendKeys(confirmPassword);}

    //

    public void enterEmailField(String email){ this.emailField.sendKeys(email);}
    public void enterphoneField(String phone){ this.phoneField.sendKeys(phone);}
    public void enterCountryField(String country){ this.countryField.sendKeys(country);}
    public void enterCityField(String city){ this.cityField.sendKeys(city);}
    public void enterPostCodeField(String postCode){ this.postCodeField.sendKeys(postCode);}
}
