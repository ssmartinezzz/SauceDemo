package pages.checkout;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends BasePage {

    protected By firstNameField = By.id("first-name");
    protected By lastNameField = By.id("last-name");
    protected By postalCodeField = By.id("postal-code");
    protected By finishBtn = By.id("finish");
    protected By cancelBtn = By.id("cancel");


    /***
     * Class constructor used when multiple pages are used in the automation.
     *  @param driver
     * @param wait
     */
    public CheckoutPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void enterCustomerInfo(String name, String lastname, String zip) {
        super.sendKeys(firstNameField, name, Duration.ofSeconds(10));
        super.sendKeys(lastNameField, lastname, Duration.ofSeconds(10));
        super.sendKeys(postalCodeField, zip, Duration.ofSeconds(10));
    }
    public void clickFinishBtn() {
        super.click(finishBtn, Duration.ofSeconds(10));

    }
    public void clickCancelBtn() {
        super.click(cancelBtn, Duration.ofSeconds(10));

    }


}
