package pages.main;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FilterPage extends BasePage {

    protected By filter = By.className("product_sort_container");
    protected By az = By.xpath("//option[@value='az']");
    protected By za = By.xpath("//option[@value='za']");
    protected By lohi = By.xpath("//option[@value='lohi']");
    protected By hilo = By.xpath("//option[@value='hilo']");

    /***
     * Class constructor used when multiple pages are used in the automation.
     *  @param driver
     * @param wait
     */
    public FilterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickFilter(){
        super.click(filter, Duration.ofSeconds(10));
    }
    public void clickAtoZ(){
        super.click(az, Duration.ofSeconds(10));
    }
    public void clickZtoA(){
        super.click(za, Duration.ofSeconds(10));
    }
    public void clickLowToHigh(){
        super.click(lohi, Duration.ofSeconds(10));
    }
    public void clickHightoLow(){
        super.click(hilo, Duration.ofSeconds(10));
    }
}
