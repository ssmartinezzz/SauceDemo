package pages.checkout;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidPurchasePage extends BasePage {

    protected By backHomeBtn = By.id("back-to-products");
    /***
     * Class constructor used when multiple pages are used in the automation.
     *  @param driver
     * @param wait
     */
    public ValidPurchasePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public Boolean isBtnVisible() {
        WebElement backButton = wait.until(ExpectedConditions.visibilityOfElementLocated(backHomeBtn));
        return backButton.isDisplayed();
    }

}
