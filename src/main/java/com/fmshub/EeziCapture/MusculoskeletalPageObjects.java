package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class MusculoskeletalPageObjects {

    final WebDriver driver;

    public MusculoskeletalPageObjects(WebDriver driver){
        this.driver=driver;
    }


    @FindBy(how = How.ID,using ="muscWNL")
    public WebElement muscWNL;

    @FindBy(how = How.ID,using ="muscWeakness")
    public WebElement muscWeakness;

    @FindBy(how = How.ID,using ="muscAmbulation")
    public WebElement muscAmbulation;

    @FindBy(how = How.ID,using ="muscLimitedMobility")
    public WebElement muscLimitedMobility;

    @FindBy(how = How.NAME,using ="muscLimitedMobilityInput")
    public WebElement muscLimitedMobilityInput;

    @FindBy(how = How.ID,using ="muscJointPain")
    public WebElement muscJointPain;

    @FindBy(how = How.NAME,using ="muscJointPainInput")
    public WebElement muscJointPainInput;

    @FindBy(how = How.ID,using ="muscPoorBalance")
    public WebElement muscpoorbalance;

    @FindBy(how = How.ID,using = "")
    public WebElement gripstrength;

    @FindBy(how = How.ID,using ="muscGripStrengthEqN")
    public WebElement muscGripStrengthEqN;

    @FindBy(how = How.ID,using="muscGripStrengthEqY")
    public WebElement muscGripStrengthEqY;

    @FindBy(how = How.NAME,using ="muscGripStrengthInput")
    public WebElement muscGripStrengthInput;

    @FindBy(how = How.ID,using ="muscBedBound")
    public WebElement muscbedbound;

    @FindBy(how = How.ID,using="muscChairBound")
    public WebElement muscchairbound;

    @FindBy(how = How.ID,using = "muscContracture")
    public WebElement musccontracture;

    @FindBy(how = How.NAME,using ="muscContractureInput")
    public WebElement muscContractureInput;

    @FindBy(how = How.ID,using = "")
    public WebElement Paralysis;

    @FindBy(how = How.ID,using ="muscParalysisRadioN")
    public WebElement muscParalysisRadioN;

    @FindBy(how = How.ID,using ="muscParalysisRadioY")
    public WebElement muscParalysisRadioY;

    @FindBy(how = How.NAME,using ="muscParalysisInput")
    public WebElement muscParalysisInput;

    @FindBy(how = How.ID,using ="muscAssistiveDevice")
    public WebElement muscAssistiveDevice;

    @FindBy(how = How.NAME,using ="muscAssistiveDeviceInput")
    public WebElement muscAssistiveDeviceInput;

    @FindBy(how = How.NAME,using ="muscComments")
    public WebElement musccomments;


    public void CaptureForm() throws InterruptedException {


     Check(muscWeakness);
     Check(muscLimitedMobility);
     EnterText(muscLimitedMobilityInput,"2");
     Check(muscJointPain);
     EnterText(muscJointPainInput,"4");
     Check(muscpoorbalance);
     Check(muscGripStrengthEqN);
     Check(muscGripStrengthEqY);
     EnterText(muscGripStrengthInput,"30");
     Check(muscchairbound);
     Check(musccontracture);
     EnterText(muscContractureInput,"1");
     Check(muscParalysisRadioN);
     Check(muscParalysisRadioY);
     EnterText(muscParalysisInput,"2");
     Check(muscAssistiveDevice);
     EnterText(muscAssistiveDeviceInput,"4");
     EnterText(musccomments,"7");





    }


}
