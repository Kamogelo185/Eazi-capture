package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.Callable;

import static com.fmshub.EeziCapture.Utils.utilities.*;
public class OstomyPageObjects {

    final WebDriver driver;

    public OstomyPageObjects(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.ID,using ="digestOstomyTypes")
    public WebElement digestOstomyTypes;

    @FindBy(how = How.NAME,using="digestOstomyStomaInput")
    public WebElement digestOstomyStomaInput;

    @FindBy(how = How.NAME,using="digestOstomyStoolInput")
    public WebElement digestOstomyStoolInput ;

    @FindBy(how = How.NAME,using="digestOstomySkinInput")
    public WebElement digestOstomySkinInput ;

    @FindBy(how = How.ID,using="digestMealsPrepared")
    public WebElement digestMealsPrepared;

    @FindBy(how = How.ID,using ="digestDietInput")
    public WebElement digestDietInput ;

    @FindBy(how = How.ID,using="digestDietInadequate")
    public WebElement digestDietInadequate;


    public void CaptureForm() throws InterruptedException {

      EnterText(digestOstomyTypes,"30");
      Check(digestOstomyStomaInput);
      EnterText(digestOstomyStomaInput,"1");
      Check(digestOstomyStoolInput);
      EnterText(digestOstomyStoolInput,"2");
      Check(digestOstomySkinInput);
      EnterText(digestOstomySkinInput,"3");
      Check(digestMealsPrepared);
      EnterText(digestDietInput,"5");
      Check(digestDietInadequate);


        }





}
