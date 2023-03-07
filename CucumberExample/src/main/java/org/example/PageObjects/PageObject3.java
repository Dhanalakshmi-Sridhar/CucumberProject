package org.example.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.browser.com.Browser.driver;

public class PageObject3
{
    public PageObject3()
    {
        PageFactory.initElements(driver, this);
    }
    //div[@class='summary entry-summary']
    @FindBy(xpath = "//div[@class='summary entry-summary']")
    WebElement page3Verify;

    public WebElement Page3VerifyName()        //Page1 class Search method
    {
        return page3Verify;
    }
}
