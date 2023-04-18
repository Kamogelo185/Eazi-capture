package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class GuPageObjects {

    final WebDriver driver;

    public GuPageObjects(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.ID,using ="guWNL")
    public WebElement guWNL;

    @FindBy(how = How.ID,using ="guIncontinence")
    public WebElement guIncontinence;

    @FindBy(how = How.ID,using ="guFrequency")
    public WebElement guFrequency;

    @FindBy(how = How.ID,using = "guRetention")
    public WebElement guRetention;

    @FindBy(how = How.ID,using ="guBladder")
    public WebElement guBladder;

    @FindBy(how = How.ID,using ="guBurning")
    public WebElement guBurning;

    @FindBy(how = How.ID,using ="guDysuria")
    public WebElement guDysuria;

    @FindBy(how = How.ID,using ="guUrgancy")
    public WebElement guUrgancy;

    @FindBy(how = How.ID,using ="" )
    public WebElement Catheter;

    @FindBy(how = How.ID,using ="guCatheterSelect")
    public WebElement guCatheterSelect;

    @FindBy(how = How.ID,using ="guCatheterLastChanged")
    public WebElement guCatheterLastChanged;

    @FindBy(how = How.NAME,using ="guCatheterFr")
    public WebElement guCatheterFr;

    @FindBy(how = How.NAME,using ="guCatheterCC")
    public WebElement guCatheterCC;

    @FindBy(how = How.ID,using = "")
    public WebElement Urine;

    @FindBy(how = How.ID,using ="guUrineHematuria")
    public WebElement guUrineHematuria;

    @FindBy(how = How.ID,using ="guUrineSediment")
    public WebElement guUrineSediment;

    @FindBy(how = How.ID,using ="guUrineOdorous")
    public WebElement guUrineOdorous;

    @FindBy(how = How.ID,using ="guUrineCloudy")
    public WebElement guUrineCloudy;

    @FindBy(how = How.ID,using ="guUrineOther")
    public WebElement guUrineOther;

    @FindBy(how = How.NAME,using ="guExternalGenitalia")
    public WebElement guExternalGenitalia;

    @FindBy(how = How.NAME,using ="guExternalGenitaliaAsPer")
    public WebElement guExternalGenitaliaAsPer;

    @FindBy(how = How.NAME,using ="guComments")
    public WebElement guComments;


    public void CaptureForm() throws InterruptedException {

    Check(guWNL);
    Check(guIncontinence);
    Select(guCatheterSelect,"Value","foley");
    EnterText(guCatheterLastChanged,"05/04/2020");
    EnterText(guCatheterFr,"1");
    EnterText(guCatheterCC,"1");
    Check(guUrineHematuria);
    EnterText(guUrineOther,"4");
    Select(guExternalGenitalia,"Value","normal");
    Select(guExternalGenitaliaAsPer,"Valve","abnormal");
    EnterText(guComments,"40");






    }


}
