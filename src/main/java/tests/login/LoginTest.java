package tests.login;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.login.LoginPage;
import pages.main.MainPage;

public class LoginTest extends BaseTest {

    @Test
    public void successLogin() {
        page.goTo("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.Log("standard_user","secret_sauce");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void incorrectLogin() {
        page.goTo("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.Log("locked_out_user","secret_sauce");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(loginPage.getLockedUserMsg());
        hardAssert.assertEquals(loginPage.getLockedUserMsg(),"Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    public void logUsingMultiplePages() {
        page.goTo("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver, wait);
        MainPage mainPage = loginPage.LogToMain("standard_user","secret_sauce");
        hardAssert.assertTrue(mainPage.isMenuVisible(), "Menu not visible");

    }



}
