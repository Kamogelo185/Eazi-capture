package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;


public class SkilledInterventionPageObjects {

    final WebDriver driver;

    public SkilledInterventionPageObjects(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(how = How.ID,using ="")
    public WebElement assessment;

    @FindBy(how = How.ID,using ="skilledInterventionVerbalizedPt")
    public WebElement skilledInterventionVerbalizedPt;

    @FindBy(how = How.NAME,using="skilledInterventionVerbalizedPtPercent")
    public WebElement skilledInterventionVerbalizedPtPercent;

    @FindBy(how = How.ID,using="skilledInterventionVerbalizedCg")
    public WebElement skilledInterventionVerbalizedCg;

    @FindBy(how = How.NAME,using="skilledInterventionVerbalizedCgPercent")
    public WebElement skilledInterventionVerbalizedCgPercent;

    @FindBy(how = How.ID,using="skilledInterventionDemonstrationPt")
    public WebElement skilledInterventionDemonstrationPt;

    @FindBy(how = How.NAME,using="skilledInterventionDemonstrationPtPercent")
    public WebElement skilledInterventionDemonstrationPtPercent;

    @FindBy(how = How.ID,using="skilledInterventionDemonstrationCg")
    public WebElement skilledInterventionDemonstrationCg;

    @FindBy(how = How.NAME,using="skilledInterventionDemonstrationCgPercent")
    public WebElement skilledInterventionDemonstrationCgPercent;

    @FindBy(how = How.ID,using="skilledInterventionRequireFurtherPt")
    public WebElement skilledInterventionRequireFurtherPt;

    @FindBy(how = How.ID,using="skilledInterventionRequireFurtherCg")
    public WebElement skilledInterventionRequireFurtherCg;
    @FindBy(how = How.NAME,using ="skilledInterventionComments")
    public WebElement skilledInterventionComments;

    @FindBy(how = How.NAME,using="skilledInterventionTeachingTool")
    public WebElement skilledInterventionTeachingTool;


    public void CaptureForm() throws InterruptedException {

     Check(skilledInterventionVerbalizedPt);
     EnterText(skilledInterventionVerbalizedPtPercent,"1");
     Check(skilledInterventionVerbalizedCg);
     EnterText(skilledInterventionVerbalizedCgPercent,"2");
     Check(skilledInterventionDemonstrationPt);
     EnterText(skilledInterventionDemonstrationPtPercent,"5");
     Check(skilledInterventionDemonstrationCg);
     EnterText(skilledInterventionDemonstrationCgPercent,"10");
     Check(skilledInterventionRequireFurtherPt);
     Check(skilledInterventionRequireFurtherCg);
     EnterText(skilledInterventionComments,"4");
     EnterText(skilledInterventionTeachingTool,"50");



        }





}
