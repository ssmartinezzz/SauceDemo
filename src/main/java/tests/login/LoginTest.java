package tests.login;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.login.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void successLogin() {
        page.goTo("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.Log("standard_user","secret_sauce");

    }

    @Test
    public void incorrectLogin() {
        page.goTo("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.Log("locked_out_user","secret_sauce");
        hardAssert.assertEquals(loginPage.getLockedUserMsg(),"Epic sadface: Sorry, this user has been locked out.");

    }
}
