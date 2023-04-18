package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.logging.Handler;

import static com.fmshub.EeziCapture.Utils.utilities.*;
public class PainPageObjects {

    final WebDriver driver;

    public PainPageObjects(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(how = How.NAME,using ="painFrequencySelect")
    public WebElement painFrequencySelect;

    @FindBy(how = How.NAME,using ="painPrimarySite")
    public WebElement painPrimarySite ;

    @FindBy(how = How.NAME,using  ="painCurrent")
    public WebElement painCurrent;

    @FindBy(how = How.NAME,using ="painWhatMakesPainWorse")
    public WebElement painWhatMakesPainWorse;

    @FindBy(how = How.ID,using ="painManagement")
    public WebElement painManagement;

    @FindBy(how = How.NAME,using ="painTowardsGoal")
    public WebElement painTowardsGoal;

    @FindBy(how = How.NAME,using ="painComments")
    public WebElement painComments ;


    public void CaptureForm() throws InterruptedException {


       Select(painFrequencySelect,"Value","all of the time");
       EnterText(painPrimarySite,"30");
       EnterText(painWhatMakesPainWorse,"40");
       Check(painManagement);
       EnterText(painTowardsGoal,"20");
       EnterText(painComments,"10");
       EnterText(painCurrent,"5");




    }

}
