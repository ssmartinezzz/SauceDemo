package pages.main;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    protected By burgerMenuButton = By.id("react-burger-menu-btn");
    protected By resetAppBtn = By.id("reset_sidebar_link");
    protected By logOutBtn = By.id("logout_sidebar_link");
    protected By allItemsBtn = By.id("inventory_sidebar_link");
    protected By crossBtn = By.id("react-burger-cross-btn");


    /***
     * Class constructor used when multiple pages are used in the automation.
     *  @param driver
     * @param wait
     */
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickBurgerMenu() {
        super.click(burgerMenuButton, Duration.ofSeconds(10));
    }

    public void clickResetAppBtn() {
        super.click(resetAppBtn, Duration.ofSeconds(10));
    }

    public void clickLogOutBtn() {
        super.click(logOutBtn, Duration.ofSeconds(10));
    }

    public void clickAllItemsBtn() {
        super.click(allItemsBtn, Duration.ofSeconds(10));
    }

    public void clickCrossBtn() {
        super.click(crossBtn, Duration.ofSeconds(10));

    }


}
