package org.example.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.browser.com.Browser.driver;
public class PageObject1
{
    public PageObject1()   //constructor
    {
        PageFactory.initElements(driver, this);
    }
    //driver.findElement(By.xpath("//input[@name='s']"))
    @FindBy(xpath = "//input[@name='s']")
    WebElement page1SearchBar;
    public WebElement Page1TextBox()        //Page1 class Search method
    {
        return page1SearchBar;
    }
    //driver.findElement(By.xpath("//div[@class='search']/div/form//div[2]/span"))
    // @FindBy(xpath="//ul[@class='products columns-5']/li/div/div/div[3]/div/h4")
    @FindBy(xpath = "//div[@class='search']/div/form//div[2]/span")
    WebElement page1Click;
    public WebElement Page1ClickOn()
    {
        return page1Click;
    }
}
