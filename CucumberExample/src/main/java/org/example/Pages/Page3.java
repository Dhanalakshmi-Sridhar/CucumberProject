package org.example.Pages;
import org.example.PageObjects.PageObject3;
import org.openqa.selenium.By;

import static org.example.browser.com.Browser.driver;

public class Page3
{
    static PageObject3 instancePage3;
    public static String searchPageNameVerify()
    {
        instancePage3 = new PageObject3();
        //return (driver.findElement(By.xpath("//div[@class='summary entry-summary']")).getText());
        //return instancepage2.Page2TextSearch().getText();
        return instancePage3.Page3VerifyName().getText();
    }
}
