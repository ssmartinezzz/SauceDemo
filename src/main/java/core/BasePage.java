package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    // Instance a driver
    protected WebDriver driver;
    // Explicit waits
    protected WebDriverWait wait;

    /***
     * Class constructor used when multiple pages are used in the automation.
     *
     * @param driver
     * @param wait
     */
    public BasePage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    /***
     * Waits for the element to be clickable
     * @param locator By element
     * @param timeout time
     */
    protected void waitForElementToBeClickable(By locator,  Duration timeout) {
        wait.withTimeout(timeout);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /***
     * Clicks the element after a wait time specified and then it clicks it
     * @param locator
     * @param timeout
     */
    protected void click(By locator, Duration timeout) {
        waitForElementToBeClickable(locator, timeout);
        driver.findElement(locator).click();
    }

    /***
     * Sends keys to the element. It waits for the element to be clickable before sending
     * keys
     * @param locator
     * @param text
     * @param timeout
     */
    protected void sendKeys(By locator, String text, Duration timeout) {
        waitForElementToBeClickable(locator, timeout);
        driver.findElement(locator).sendKeys(text);
    }

    /***
     * Makes the driver go to the specified url
     * @param UrI
     */
    public void goTo (String UrI){
        driver.get(UrI);

    }


}
