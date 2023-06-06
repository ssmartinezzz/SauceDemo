package pages.cart;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CartPage extends BasePage {

    protected By itemName = By.cssSelector("div[class='inventory_item_name']");
    protected By deleteButton = By.xpath("//button[@class='btn btn_secondary btn_small cart_button']");
    protected By continueShopping = By.id("continue-shopping");
    protected By checkoutBtn = By.id("checkout");



    /***
     * Class constructor used when multiple pages are used in the automation.
     *  @param driver
     * @param wait
     */
    public CartPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /***
     * Gets in a List the strings of the products' names
     * @return
     */
    public List<String> getItemNamesText() {
        List<String> itemNames = new ArrayList<>();
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(itemName));
        for (WebElement element: elements) {
            String text = element.getText();
            itemNames.add(text);
            
        }
        return itemNames;
    }

    public void deleteItemFromCart(String[] items, String item) {
            int index = -1;

            for (int i = 0; i < items.length; i++) {
                String text = items[i];
                if (text.equals(item)) {
                    index = i;
                    break;
                }
            }
            if (index >= 0) {
                List<WebElement> deleteButtonsList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(deleteButton));
                if (index < deleteButtonsList.size()) {
                    WebElement deleteBtn = deleteButtonsList.get(index);
                    deleteBtn.click();
                } else {
                    System.out.println("No delete button found");
                }
            } else {
                System.out.println("No element with name " + item);
            }
        }

        public void clickContinueShopping() {
            super.click(continueShopping, Duration.ofSeconds(10));

        }

        public void clickCheckoutBtn() {
            super.click(checkoutBtn, Duration.ofSeconds(10));

        }

    }








