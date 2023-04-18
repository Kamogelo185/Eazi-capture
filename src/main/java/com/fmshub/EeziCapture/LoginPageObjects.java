package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;

public class LoginPageObjects {

    final WebDriver driver;

    public LoginPageObjects(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.ID,using ="")
    public WebElement username;

    @FindBy(how = How.ID,using ="")
    public WebElement password;

    @FindBy(how = How.ID,using ="")
    public WebElement loginButton;

    public void CaptureForm() throws InterruptedException {

        EnterText(username,"");
        EnterText(password,"");
        Click(loginButton);

    }
}
