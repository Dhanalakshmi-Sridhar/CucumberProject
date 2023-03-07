package org.example.Pages;

import org.example.PageObjects.PageObject2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
public class Page2
{
    static PageObject2 instancepage2;
    public static String searchText()
    {
        instancepage2 = new PageObject2();
        //return (driver.findElement(By.xpath("//div[@id='content']/nav")).getText());
        return instancepage2.Page2TextSearch().getText();

    }
    public static void productSelection(String lotus) throws Exception{
        try
        {
            Thread.sleep(3000);
            //List<WebElement> list = driver.findElements(By.xpath("//ul[@class='products columns-5']/li/div/div/div[3]/div/h4/a"));
            List<WebElement> list = instancepage2.Page2ProductSelect().findElements(By.xpath(".//li/div/div/div[3]/div/h4/a"));

            for(WebElement ele:list)
            {
                String products = ele.getText();
                System.out.println(products);
                if(products.contains(lotus))
                {
                    ele.click();
                    break;
                }
                else
                {
                    System.out.println("Wrong Product");
                }

            }
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }
}