package pages.checkout;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmPage extends BasePage {
    protected By subtotal = By.xpath("//div[@class='summary_subtotal_label']");
    protected By cancelBtn = By.id("cancel");
    protected By finishBtn = By.id("finish");

    /***
     * Class constructor used when multiple pages are used in the automation.
     *  @param driver
     * @param wait
     */
    public ConfirmPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public String getSubTotal() {
        WebElement subtotalElement = wait.until(ExpectedConditions.visibilityOfElementLocated(subtotal));
        String subtotalText = subtotalElement.getText();

        return subtotalText.replaceAll("[^0-9.]", "");
    }
    public void clickCancel() {
        super.click(cancelBtn, Duration.ofSeconds(10));
    }

    public void clickFinish() {
        super.click(finishBtn, Duration.ofSeconds(10));
    }

}
