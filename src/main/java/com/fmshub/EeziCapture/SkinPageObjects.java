package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.security.auth.callback.CallbackHandler;

import java.util.concurrent.Callable;

import static com.fmshub.EeziCapture.Utils.utilities.*;
public class SkinPageObjects {

    final WebDriver driver;

    public SkinPageObjects(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(how = How.ID,using="skinWNL")
    public WebElement skinWNL;

    @FindBy(how = How.ID,using ="skinDry")
    public WebElement skinDry;

    @FindBy(how = How.ID,using="skinClamy")
    public WebElement skinClamy;

    @FindBy(how = How.ID,using="skinWarm")
    public WebElement skinWarm;

    @FindBy(how = How.ID,using ="skinCool")
    public WebElement skinCool;

    @FindBy(how = How.ID,using ="skinPallor")
    public WebElement skinPallor;

    @FindBy(how = How.NAME,using ="skinTurgor")
    public WebElement skinTurgor;

    @FindBy(how = How.ID,using = "")
    public WebElement Woundcareworksheet;

    @FindBy(how = How.NAME,using ="skinComments")
    public WebElement skinComments;


    public void CaptureForm() throws InterruptedException {

      Check(skinWNL);
      Check(skinDry);
      Check(skinWarm);
      Check(skinCool);
      Check(skinClamy);
      Check(skinPallor);
      Select(skinTurgor,"Value","poor");
      EnterText(skinComments,"40");









    }


}
