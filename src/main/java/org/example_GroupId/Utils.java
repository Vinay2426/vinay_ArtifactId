package org.example_GroupId;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage
{
    //(1)assert equal URL (StringURL) {}
    public void assertEqualURL(String expected)
    {
        Assert.assertEquals(driver.getCurrentUrl(),expected);
    }

    //(2) it will click on elements
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //(4) to enter text of element
    public static void sendText (By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //(5)date stamp long
    public static String longDateStamp()
    {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat();
        return new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
    }
}
