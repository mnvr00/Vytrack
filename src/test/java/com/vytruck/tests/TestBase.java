package com.vytruck.tests;

import com.vytruck.pages.DashboardPage;
import com.vytruck.pages.LoginPage;
import com.vytruck.utilities.ConfigurationReader;
import com.vytruck.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    public WebDriver driver = Driver.get();
    WebDriverWait wait;
    Actions actions;

    @BeforeMethod
    public void setUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url = ConfigurationReader.get("url");
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
        driver.get(url);

        LoginPage lp = new LoginPage();
        lp.login();

        DashboardPage dp = new DashboardPage();
        dp.navigateToModule("Activities","Calendar Events");



    }

    @AfterMethod
    public void closeDown() {
        Driver.closeDriver();
    }


}