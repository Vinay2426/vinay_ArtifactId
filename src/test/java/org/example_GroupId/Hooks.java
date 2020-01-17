package org.example_GroupId;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils
{
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProps loadProps = new LoadProps();

    @Before
    public void setUpBrowser()
    {
        browserSelector.setUpBrowser();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(loadProps.getProperty("url"));
    }
    @After
    public void closeBrowser()
    {
        driver.quit();
    }
}
