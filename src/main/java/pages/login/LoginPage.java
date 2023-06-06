package pages.login;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
   protected By userLoginField = By.id("user-name");
   protected By passwordLoginField = By.id("password");
   protected By loginButton = By.id("login-button");

    /***
     * Class constructor used when multiple pages are used in the automation.
     *  @param driver
     * @param wait
     */
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /***
     * Sends the username into the User field
     * @param username String
     */
    public void enterUsername(String username) {
        super.sendKeys(userLoginField, username, Duration.ofSeconds(10));
    }

    /***
     * Sends the password into the Password field
     * @param password String
     */
    public void enterPassword(String password) {
        super.sendKeys(passwordLoginField, password, Duration.ofSeconds(10));
    }

    /***
     * Clicks the Login Button
     */
    public void clickLoginButton() {
        super.click(loginButton, Duration.ofSeconds(10));
    }

    /***
     * Void method for no returning another Page
     * @param username
     * @param password
     */
    public void Log(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }


}
