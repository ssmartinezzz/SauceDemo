package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    protected By burgerMenuButton = By.id("react-burger-menu-btn");
    protected By resetAppBtn = By.id("about_sidebar_link");

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


}
