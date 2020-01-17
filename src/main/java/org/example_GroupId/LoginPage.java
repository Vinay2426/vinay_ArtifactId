package org.example_GroupId;

import org.openqa.selenium.By;

public class LoginPage extends Utils
{
    LoadProps loadProps = new LoadProps();

    private By _userName = By.id("txtUsername");
    private By _password = By.id("txtPassword");
    private By _clickOnLogin = By.id("btnLogin");

    public void userEnterValidCredential()
    {
        sendText(_userName, loadProps.getProperty("name"));
        sendText(_password, loadProps.getProperty("password"));
        clickOnElement(_clickOnLogin);
    }
}
