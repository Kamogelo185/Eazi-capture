package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class VisionPageObjects {

    final WebDriver driver;

    public VisionPageObjects(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.ID,using = "")
    public WebElement vision;

    @FindBy(how = How.ID,using ="neuroVisionWNL")
    public WebElement neuroVisionWNL;

    @FindBy(how = How.ID,using ="neuroVisionGlasses")
    public WebElement neuroVisionGlasses;

    @FindBy(how = How.ID,using ="neuroVisionContactsLeft")
    public WebElement neuroVisionContactsLeft;

    @FindBy(how = How.ID,using ="neuroVisionContactsRight")
    public WebElement neuroVisionContactsRight;

    @FindBy(how = How.ID,using ="neuroVisionBlurred")
    public  WebElement neuroVisionBlurred;

    @FindBy(how = How.ID,using ="neuroVisionGlaucoma")
    public WebElement neuroVisionGlaucoma;

    @FindBy(how = How.ID,using ="neuroVisionCataracts")
    public WebElement neuroVisionCataracts;

    @FindBy(how = How.ID,using ="neuroVisionMacular")
    public WebElement neuroVisionMacular;

    @FindBy(how = How.ID,using ="")
    public WebElement neuroVisionOther;

    @FindBy(how = How.ID,using ="neuroBlind")
    public WebElement neuroBlind;

    @FindBy(how = How.ID,using ="neuroDecreasedSensation")
    public WebElement neuroDecreasedSensation;

    @FindBy(how = How.NAME,using ="neuroComments")
    public WebElement neuroComments;

    @FindBy(how = How.ID,using ="")
    public WebElement medicationchangesincelastvist;

    @FindBy(how = How.ID,using ="medicalMedicataionChangN")
    public WebElement medicalMedicataionChangN;

    @FindBy(how = How.ID,using ="medicalMedicataionChangeY")
    public WebElement medicalMedicataionChangeY;

    @FindBy(how = How.ID,using = "")
    public WebElement demonstratedmedicationcompliance;

    @FindBy(how = How.ID,using ="medicalMedicataionComplianceN")
    public WebElement medicalMedicataionComplianceN;

    @FindBy(how = How.ID,using ="medicalMedicataionComplianceY")
    public WebElement medicalMedicataionComplianceY;

    @FindBy(how = How.NAME,using="medicalMedicataionComments")
    public WebElement medicalMedicataionComments;



    public void CaptureForm() throws InterruptedException {

       Check(neuroVisionWNL);
       Check(neuroVisionGlasses);
       Check(neuroVisionContactsLeft);
       Check(neuroVisionContactsRight);
       Check(neuroVisionBlurred);
       Check(neuroVisionGlaucoma);
       Check(neuroVisionCataracts);
       Check(neuroVisionMacular);
       Check(neuroVisionOther);
       EnterText(neuroVisionOther,"10");





    }






}
