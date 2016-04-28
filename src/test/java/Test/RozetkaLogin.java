package Test;

import Package.RozetkaLoginPage;
import SetUp.SetUp;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Игорь on 19.04.2016.
 */
public class RozetkaLogin {
    WebDriver driver;
    String expectedUserName = "testjavaqa";
    String userEmail = "utes4all@gmail.com";
    String userPassword = "test12345";

    @Before
    public void setUp(){
        SetUp SetUp = new SetUp();
        driver = SetUp.getDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void RozetkaLogin() throws InterruptedException {
        //This is login test for Rozetka
        //Second commit
        RozetkaLoginPage loginPage = new RozetkaLoginPage(driver);
        loginPage.login(userEmail, userPassword);
        Thread.sleep(1000);
        Assert.assertTrue(loginPage.checkUserNameAfterLogin(expectedUserName));
    }

}


