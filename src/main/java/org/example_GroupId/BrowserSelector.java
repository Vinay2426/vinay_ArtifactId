package org.example_GroupId;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;

public class BrowserSelector extends Utils
{
    LoadProps loadProps = new LoadProps();

    public void setUpBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/Resources/BrowserDriver/chromedriver.exe");
        //driver = new ChromeDriver();

        //if you want to run your program in incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver=new ChromeDriver(capabilities);
    }
}
