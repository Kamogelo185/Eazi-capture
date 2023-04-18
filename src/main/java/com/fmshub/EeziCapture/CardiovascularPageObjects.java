package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class CardiovascularPageObjects {

    final WebDriver driver;

    public CardiovascularPageObjects(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.ID,using ="cardioWnl")
    public WebElement cardioWnl;

    @FindBy(how = How.NAME,using ="cardioPainComment")
    public WebElement cardioPainComment;

    @FindBy(how = How.ID,using = "")
    public WebElement heartsounds;

    @FindBy(how = How.ID,using ="cardioMurmur")
    public WebElement cardioMurmur;

    @FindBy(how = How.ID,using ="cardioGallop")
    public WebElement cardioGallop;

    @FindBy(how = How.ID,using ="cardioClick")
    public WebElement cardioClick;

    @FindBy(how = How.ID,using ="cardioIrregular")
    public WebElement cardioIrregular;

    @FindBy(how = How.ID,using ="cardioPeripheralPulses")
    public WebElement cardioPeripheralPulses;

    @FindBy(how = How.NAME,using ="cardioPeripheralPulsesInput")
    public WebElement cardioPeripheralPulsesInput;

    @FindBy(how = How.ID,using = "")
    public WebElement caprefill;

    @FindBy(how = How.ID,using ="cardioCapRefill3N")
    public WebElement cardioCapRefill3N;

    @FindBy(how = How.ID,using ="cardioCapRefill3Y")
    public WebElement cardioCapRefill3Y;

    @FindBy(how = How.NAME,using ="cardioDizzinessInput")
    public WebElement cardioDizzinessInput;

    @FindBy(how = How.ID,using ="cardioEdema")
    public WebElement cardioEdema;

    @FindBy(how = How.NAME,using ="cardioEdemaInput1")
    public WebElement cardioEdemaInput1;

    @FindBy(how = How.NAME,using ="cardioEdemaSelect1")
    public WebElement cardioEdemaSelect1;

    @FindBy(how = How.NAME,using ="cardioEdemaInput2")
    public WebElement cardioEdemaInput2;

    @FindBy(how = How.NAME,using ="cardioEdemaSelect2")
    public WebElement cardioEdemaSelect2;

    @FindBy(how = How.NAME,using ="cardioEdemaInput3")
    public WebElement cardioEdemaInput3;

    @FindBy(how = How.NAME,using ="cardioEdemaSelect3")
    public WebElement cardioEdemaSelect3;

    @FindBy(how = How.ID,using ="cardioNeckVein")
    public WebElement cardioNeckVein;

    @FindBy(how = How.NAME,using ="cardioNeckVeinInput")
    public WebElement cardioNeckVeinInput;

    @FindBy(how = How.NAME,using ="cardioComments")
    public WebElement cardioComments;

    public void CaptureForm() throws InterruptedException {

     Check(cardioWnl);
     EnterText(cardioPainComment,"88");
     Check(cardioIrregular);
     Check(cardioPeripheralPulses);
     Check(cardioCapRefill3N);
     EnterText(cardioDizzinessInput,"100");
     Check(cardioEdemaInput2);
     Select(cardioEdemaSelect1,"Value","oral");
     Check(cardioNeckVein);
     EnterText(cardioNeckVeinInput, "23");
     EnterText(cardioComments,"12");
     EnterText(cardioPeripheralPulsesInput,"44");

    }
}
