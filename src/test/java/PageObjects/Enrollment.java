package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enrollment {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;


    public Enrollment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnNextButton(){ this.nextButton.click(); }

}
