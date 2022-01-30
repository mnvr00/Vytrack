package com.vytruck.pages;

import com.vytruck.tests.TestBase;
import com.vytruck.utilities.ConfigurationReader;
import com.vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "#prependedInput")
    public WebElement usernameInput;

    @FindBy(css = "[type=password]")
    public WebElement passwordInput;

    @FindBy(css = "[type=submit]")
    public WebElement submit;

    public void login(){
        String username = ConfigurationReader.get("usernameStoreManager");
        String password = ConfigurationReader.get("passwordStoreManager");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submit.click();
    }
}
