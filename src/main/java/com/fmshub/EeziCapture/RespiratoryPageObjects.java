package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class RespiratoryPageObjects {

    final WebDriver driver;

    public RespiratoryPageObjects(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(how = How.ID,using ="respWnl")
    public WebElement respWnl ;

    @FindBy(how = How.NAME,using ="respLungSoundsInput")
    public  WebElement respLungSoundsInput;

    @FindBy(how = How.NAME,using ="respLungSoundsSelect")
    public WebElement respLungSoundsSelect;

    @FindBy(how = How.NAME,using="respLungSoundsSelect1")
    public WebElement respLungSoundsSelect1;

    @FindBy(how = How.NAME,using ="respLungSoundsInput1")
    public WebElement respLungSoundsInput1;

    @FindBy(how = How.NAME,using ="respLungSoundsSelect2")
    public  WebElement respLungSoundsSelect2;

    @FindBy(how = How.NAME,using ="respLungSoundsInput2")
    public WebElement respLungSoundsInput2;

    @FindBy(how = How.NAME,using ="respLungSoundsSelect3")
    public WebElement respLungSoundsSelect3;

    @FindBy(how = How.NAME,using ="respLungSoundsInput3")
    public WebElement respLungSoundsInput3;

    @FindBy(how = How.ID,using ="respSob")
    public WebElement respSob;

    @FindBy(how = How.NAME,using ="respSobSelect")
    public WebElement respSobSelect;

    @FindBy(how = How.NAME,using ="respCough")
    public WebElement respCough;

    @FindBy(how = How.NAME,using ="respCoughSelect")
    public WebElement respCoughSelect ;

    @FindBy(how = How.ID,using ="respSputum")
    public WebElement respSputum;

    @FindBy(how = How.NAME,using ="respSputumAmount")
    public  WebElement respSputumAmount;

    @FindBy(how = How.NAME,using ="respSputumDesc")
    public WebElement respSputumDesc;

    @FindBy(how = How.NAME,using ="respo2Input")
    public  WebElement respo2Input ;

    @FindBy(how = How.NAME,using ="respLPM")
    public WebElement respLPM;

    @FindBy(how = How.ID,using ="o2val")
    public WebElement o2val;

    @FindBy(how = How.NAME,using ="respO2SatSelect")
    public WebElement respO2SatSelect;

    @FindBy(how = How.ID,using ="respNebulizer")
    public WebElement respNebulizer;

    @FindBy(how = How.NAME,using ="respNebulizerInput")
    public WebElement respNebulizerInput;

    @FindBy(how = How.NAME,using ="respComments")
    public WebElement respComments;


    public void CaptureForm() throws InterruptedException {

     Check(respWnl);
     Select(respLungSoundsSelect,"Index","1");
     EnterText(respLungSoundsInput,"All 4 lobes");

     Select(respLungSoundsSelect1,"Index","1");
     EnterText(respLungSoundsInput1,"All 4 lobes");

     Select(respLungSoundsSelect2,"Index","1");
     EnterText(respLungSoundsInput2,"All 4 lobes");

     Select(respLungSoundsSelect3,"Index","1");
     EnterText(respLungSoundsInput3,"All 4 lobes");
     Check(respSob);
     Select(respSobSelect,"Index","4");
     Check(respCough);
     Select(respCoughSelect,"Index","2");
     Check(respSputum);
     EnterText(respSputumAmount,"20");
     EnterText(respSputumDesc,"40");
     EnterText(respo2Input,"10");
     EnterText(respLPM,"20");
     EnterText(o2val,"10");
     Select(respO2SatSelect,"Index","2");
     Check(respNebulizer);
     EnterText(respNebulizerInput,"40");
     EnterText(respComments,"5");












    }
}
