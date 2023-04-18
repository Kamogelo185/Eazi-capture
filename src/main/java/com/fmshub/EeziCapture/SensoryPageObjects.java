package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class SensoryPageObjects {

    final WebDriver driver;

    public SensoryPageObjects(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(how = How.ID,using = "")
    public WebElement sensory;

    @FindBy(how = How.ID,using ="neuroWnl")
    public WebElement neuroWnl;

    @FindBy(how = How.ID,using ="neuroHearingimpariedLeft")
    public WebElement neuroHearingimpariedLeft;

     @FindBy(how = How.ID,using ="neuroHearingimpariedRight")
     public WebElement neuroHearingimpariedRight;

     @FindBy(how = How.ID,using ="neuroDeaf")
     public WebElement neuroDeaf;

     @FindBy(how = How.ID,using ="neuroSpeechImpaired")
     public WebElement neuroSpeechImpaired;


    public void CaptureForm() throws InterruptedException {

     Check(neuroWnl);
     Check(neuroHearingimpariedLeft);
     Check(neuroHearingimpariedRight);
     Check(neuroDeaf);
     Check(neuroSpeechImpaired);



    }


}
