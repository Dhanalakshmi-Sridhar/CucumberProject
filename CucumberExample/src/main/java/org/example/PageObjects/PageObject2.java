package org.example.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.browser.com.Browser.driver;
public class PageObject2
{
    public PageObject2()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='content']/nav")
    WebElement page2TextSearch;

    public WebElement Page2TextSearch()        //Page1 class Search method
    {
        return page2TextSearch;
    }
    //@FindBy(xpath = "//ul[@class='products columns-5']")
    @FindBy(xpath ="//ul[@class='products columns-5']")
    WebElement page2ProdSelect;

    public WebElement Page2ProductSelect()        //Page1 class Search method
    {
        return page2ProdSelect;
    }
}
