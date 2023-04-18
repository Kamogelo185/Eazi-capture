package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;

public class TubeFeedingPageObjects {

    final WebDriver driver;

    public TubeFeedingPageObjects(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.ID,using="digestTubeFeedingFormula")
    public WebElement digestTubeFeedingFormula;

    @FindBy(how = How.NAME,using="digestTubeFeedingFormulaInput")
    public WebElement digestTubeFeedingFormulaInput;

    @FindBy(how = How.ID,using="digestTubeFeedingBolus")
    public WebElement digestTubeFeedingBolus;

    @FindBy(how = How.NAME,using="digestTubeFeedingBolusCC")
    public WebElement digestTubeFeedingBolusCC;

    @FindBy(how = How.NAME,using="digestTubeFeedingBolusHour")
    public WebElement digestTubeFeedingBolusHour;

    @FindBy(how = How.ID,using="digestTubeFeedingContinous")
    public WebElement digestTubeFeedingContinous;

    @FindBy(how = How.NAME,using="digestTubeFeedingContinousCC")
    public WebElement digestTubeFeedingContinousCC;

    @FindBy(how = How.NAME,using="digestTubeFeedingContinousHr")
    public WebElement digestTubeFeedingContinousHr;

    @FindBy(how = How.ID,using ="digestTubeFeedingPlacementChecked")
    public WebElement digestTubeFeedingPlacementChecked;

    @FindBy(how = How.ID,using="digestTubeFeedingResidualChecked")
    public WebElement digestTubeFeedingResidualChecked;

    @FindBy(how = How.NAME,using="digestComments")
    public WebElement digestComments;





    public void CaptureForm() throws InterruptedException {

     Check(digestTubeFeedingFormula);
     EnterText(digestTubeFeedingFormulaInput,"20");
     Check(digestTubeFeedingBolus);
     EnterText(digestTubeFeedingBolusCC,"5");
     EnterText(digestTubeFeedingBolusHour,"5");
     Check(digestTubeFeedingContinous);
     EnterText(digestTubeFeedingContinousCC,"5");
     Select(digestTubeFeedingContinousHr,"Value","GRAVITY");
     Check(digestTubeFeedingPlacementChecked);
     Check(digestTubeFeedingResidualChecked);
     EnterText(digestComments,"4");











    }


}
