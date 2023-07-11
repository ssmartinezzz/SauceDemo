package tests.addItem;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.login.LoginPage;
import pages.main.MainPage;
import pages.main.ProductsPage;

public class AddItemTest extends BaseTest {

    @Test
    public void addItem ()  {
        page.goTo("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver, wait);
        MainPage mainPage = loginPage.LogToMain("standard_user","secret_sauce");
        mainPage.openTab();
        ProductsPage productsPage = new ProductsPage(driver,wait);
        productsPage.clickAddButtonByProductName("Sauce Labs Backpack");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void addErrorItem() {
        page.goTo("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver, wait);
        MainPage mainPage = loginPage.LogToMain("standard_user","secret_sauce");
        mainPage.openTab();
        ProductsPage productsPage = new ProductsPage(driver,wait);
        try {
            productsPage.clickAddButtonByProductName("None");
        }
        catch (RuntimeException error){
            System.out.println("Error: " + error);
        }
        try {

            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

    @Test
    public void addMultipleItems() {
        page.goTo("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver, wait);
        MainPage mainPage = loginPage.LogToMain("standard_user","secret_sauce");
        mainPage.openTab();
        ProductsPage productsPage = new ProductsPage(driver,wait);
        try {
            productsPage.clickAddButtonByProductName("Sauce Labs Backpack");
            productsPage.clickAddButtonByProductName("Sauce Labs Fleece Jacket");
            productsPage.clickAddButtonByProductName("Sauce Labs Onesie");


        }
        catch (RuntimeException error){
            System.out.println("Error: " + error);
        }
        try {

            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }


}
