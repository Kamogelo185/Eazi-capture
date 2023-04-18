package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;

public class VitalSignsPageObjects {

    final WebDriver driver;

    public VitalSignsPageObjects(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how= How.ID, using="VSTemp")
    public WebElement VSTemp;
    @FindBy(how= How.NAME, using="vitalSignTempMethod")
    public WebElement vitalSignTempMethod;

    @FindBy(how= How.ID, using="VSPulseRadical")
    public WebElement VSPulseRadical;

    @FindBy(how= How.ID, using="vitalSignPulseRegularR")
    public WebElement vitalSignPulseRegularR;

    @FindBy(how= How.ID, using="vitalSignPulseRegularI")
    public WebElement vitalSignPulseRegularI;

    @FindBy(how= How.ID, using="VSResp")
    public WebElement VSResp;

    @FindBy(how= How.ID, using="vitalSignWeight")
    public WebElement vitalSignWeight;

    @FindBy(how = How.ID,using ="VSBPr1")
    public WebElement VSBPr1;

    @FindBy(how = How.NAME,using ="vitalSignBpRSelect")
    public WebElement vitalSignBpRSelect;

    @FindBy(how = How.ID,using = "VSBPl1")
    public WebElement VSBPl1;

    @FindBy(how = How.NAME,using ="vitalSignBpLSelect")
    public WebElement vitalSignBpLSelect;

    @FindBy(how = How.ID,using ="VSBloodSugar")
    public WebElement VSBloodSugar;

    @FindBy(how = How.ID,using ="vitalSignFasting1")
    public WebElement vitalSignFasting1;

    @FindBy(how = How.ID,using ="vitalSignFasting2")
    public WebElement vitalSignFasting2;

    @FindBy(how = How.ID,using ="vitalSignFasting3")
    public WebElement vitalSignFasting3;

    @FindBy(how = How.ID,using ="vitalSignStandard")
    public WebElement vitalSignStandard;

    @FindBy(how = How.NAME,using ="vitalSignComments")
    public WebElement vitalSignComments;

    public void CaptureForm() throws InterruptedException {
        EnterText(VSTemp,"26");
        Select(vitalSignTempMethod,"Value","Oral");
        EnterText(VSPulseRadical,"123");
        Check(vitalSignPulseRegularR);
        EnterText(VSResp,"12");
        EnterText(vitalSignWeight,"20");
        Select(vitalSignBpRSelect,"Value","Temporal");
        //Select(vitalSignBpRSelect,"Index","4");
        EnterText(VSBloodSugar,"66");
        Check(vitalSignFasting2);
        Check(vitalSignStandard);
        EnterText(vitalSignComments,"73");





    }


}
