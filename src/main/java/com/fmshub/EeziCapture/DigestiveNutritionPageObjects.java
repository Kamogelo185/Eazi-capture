package com.fmshub.EeziCapture;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class DigestiveNutritionPageObjects {


    final WebDriver driver;

    public DigestiveNutritionPageObjects(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(how = How.ID,using ="digestWNL")
    public WebElement digestWNL;

    @FindBy(how = How.ID,using ="digestNPO")
    public WebElement digestNPO ;

    @FindBy(how = How.ID,using ="digestDiarrhea")
    public WebElement digestDiarrhea;

    @FindBy(how = How.ID,using ="digestBowelIncontinence")
    public WebElement digestBowelIncontinence;

    @FindBy(how = How.ID,using ="digestDysphagia")
    public WebElement digestDysphagia;

    @FindBy(how = How.ID,using ="digestNausea")
    public WebElement digestNausea;

    @FindBy(how = How.ID,using ="digestReflux")
    public WebElement digestReflux;

    @FindBy(how = How.ID,using ="digestConstipation")
    public WebElement digestConstipation;

    @FindBy(how = How.ID,using ="digestDecreasedAppetite")
    public WebElement digestDecreasedAppetite;
    @FindBy(how = How.NAME,using ="digestWeightAmount")
    public WebElement digestWeightAmount;

    @FindBy(how = How.NAME,using ="digestBowelSounds")
    public WebElement digestBowelSounds;

    @FindBy(how = How.NAME,using ="digestAbdGirth")
    public WebElement digestAbdGirth;

    @FindBy(how = How.ID,using ="digestLastBM")
    public WebElement digestLastBM;

    @FindBy(how = How.NAME,using ="digestLastBmAsPer")
    public WebElement digestLastBmAsPer;

    @FindBy(how = How.ID,using ="digestLastBmWNL")
    public WebElement digestLastBmWNL;

    @FindBy(how = How.ID,using ="digestLastBmAbnormal")
    public WebElement digestLastBmAbnormal;

    @FindBy(how = How.ID,using ="digestLastBmGray")
    public WebElement digestLastBmGray;

    @FindBy(how = How.ID,using ="digestLastBmTarry")
    public WebElement digestLastBmTarry;

    @FindBy(how = How.ID,using ="digestLastBmFreshBlood")
    public WebElement digestLastBmFreshBlood;

    @FindBy(how = How.ID,using ="digestLastBmBlack")
    public WebElement digestLastBmBlack;

    @FindBy(how = How.ID,using ="digestLastBmConstipation")
    public WebElement digestLastBmConstipation;

    @FindBy(how = How.ID,using="digestLastBmType1")
    public WebElement digestLastBmType1;

    @FindBy(how = How.ID,using="digestLastBmType2")
    public WebElement digestLastBmType2;

    @FindBy(how = How.ID,using="digestLastBmType3")
    public WebElement digestLastBmType3;

    @FindBy(how = How.ID,using="digestLastBmLaxEnema")
    public WebElement digestLastBmLaxEnema;

    @FindBy(how = How.ID,using="digestLastBmHemorrhoids")
    public WebElement digestLastBmHemorrhoids;

    @FindBy(how = How.ID,using="digestLastBmHemorrhoidsINT")
    public WebElement digestLastBmHemorrhoidsINT;

    @FindBy(how = How.ID,using="digestLastBmHemorrhoidsEXT")
    public WebElement digestLastBmHemorrhoidsEXT;


    public void CaptureForm() throws InterruptedException {

     Check(digestWNL);
     Check(digestNPO);
     Check(digestDiarrhea);
     Check(digestBowelIncontinence);
     Check(digestDysphagia);
     Check(digestNausea);
     Check(digestReflux);
     Check(digestConstipation);
     Check(digestDecreasedAppetite);
     Select(digestBowelSounds,"Value","normal");
     EnterText(digestAbdGirth,"2");
     EnterText(digestLastBM,"3");
     Select(digestLastBmAsPer,"Value","14");







    }


}
