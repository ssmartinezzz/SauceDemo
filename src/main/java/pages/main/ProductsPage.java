package pages.main;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductsPage extends BasePage {

    protected By productName = By.xpath("//div[@class='inventory_item_name']");
    protected By addToCart = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
    /***
     * Class constructor used when multiple pages are used in the automation.
     *  @param driver
     * @param wait
     */
    public ProductsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void clickAddButtonByProductName(String lookupVal) {
        int index = -1;
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productName));
        for (WebElement element : elements) {
            String name = element.getText();
            if (name.equals(lookupVal)) {
                index = elements.indexOf(element);
                List<WebElement> addButtonList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(addToCart));
                WebElement correctButton = addButtonList.get(index);
                correctButton.click();
            }
            else {
                System.out.printf("Add to cart button not found");
            }
        }

        System.out.println("Product not found: " + productName);
    }
}
