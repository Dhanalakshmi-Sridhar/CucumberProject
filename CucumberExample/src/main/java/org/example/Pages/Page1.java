package org.example.Pages;
import org.example.PageObjects.PageObject1;
import org.example.browser.com.Browser;

//import static org.example.browser.com.*;
public class Page1
{
    static PageObject1 instancepage1;

    public static String getTitle()
    {
        return Browser.driver.getTitle();
    }
    public static void Searchdata(String product)
    {
        instancepage1 = new PageObject1();
        //driver.findElement(By.xpath("//input[@name='s']")).sendKeys(product);
        instancepage1.Page1TextBox().sendKeys(product);
    }
    public static void clickon()
    {
        instancepage1 = new PageObject1();
       //driver.findElement(By.xpath("//div[@class='search']/div/form//div[2]/span")).click();
        //path is given in PageObject1, just call by using its instance
        instancepage1.Page1ClickOn().click();
    }

}
