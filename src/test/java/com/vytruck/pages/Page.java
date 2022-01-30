package com.vytruck.pages;

import com.vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page extends BasePage {

    public Page(){
        PageFactory.initElements(Driver.get(),this);
    }

   @FindBy(xpath = "(//div[@data-toggle='dropdown'])[2]")
    public WebElement options;
   @FindBy(xpath = "//input[@type='number']")
    public WebElement page1;

   @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement twentyfive;


}
