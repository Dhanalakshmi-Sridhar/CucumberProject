package screenshot;

import org.apache.commons.io.FileUtils;
import org.example.browser.com.Browser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
public class Screenshot1 extends Browser
{
           public static void ScreenShot(String name) throws Exception
           {
            try
            {
                TakesScreenshot scrShot =((TakesScreenshot)driver);
                //TakesScreenshot is a class to capture the screenshot, srcshot is a object name
                File Src = scrShot.getScreenshotAs(OutputType.FILE); // getScreenshotAs method to capture screen

                String filePath = System.getProperty("user.dir")+"//target//Screenshot//"+name+".png";
                File Dest = new File(filePath);
                FileUtils.copyFile(Src, Dest);
            }
            catch (Exception e)
            {
                System.out.println("Screen Captured");
            }

        }


    }


