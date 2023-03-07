package org.example.example;
import org.example.browser.com.Browser;
import org.example.Pages.*;
public class Main  {
    public static void main(String[] args) throws Exception
    {
        Browser.Intialization();
        Browser.Setup("https://www.smartbazaar.co.uk/");
        Thread.sleep(1000);
        System.out.println(Page1.getTitle());
        Page1.Searchdata("flowers");
        Page1.clickon();
        System.out.println(Page2.searchText());
        Thread.sleep(3000);
        Page2.productSelection("SAMPANGI / TUBEROSE / GAJRA FLOWERS (100G)");
        Page3.searchPageNameVerify();
        Thread.sleep(3000);
        Browser.Close();
    }
}