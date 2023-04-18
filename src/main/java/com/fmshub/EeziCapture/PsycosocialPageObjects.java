package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class PsycosocialPageObjects {

    final WebDriver driver;

    public PsycosocialPageObjects(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(how = How.NAME,using ="psycWNL")
    public WebElement psycWNL;

    @FindBy(how = How.ID,using ="psycPoorHomeEnvironment")
    public WebElement psycPoorHomeEnvironment ;

    @FindBy(how = How.ID,using ="psycPoorCopingSkills")
    public WebElement psycPoorCopingSkills;

    @FindBy(how = How.ID,using ="psycAgitated")
    public WebElement psycAgitated;

    @FindBy(how = How.ID,using ="psycDepressedMood")
    public WebElement psycDepressedMood ;

    @FindBy(how = How.ID,using ="psycImpairedDecisionMaking")
    public WebElement psycImpairedDecisionMaking ;

    @FindBy(how = How.ID,using ="psycDemonstratedExpressedAnxiety")
    public WebElement psycDemonstratedExpressedAnxiety;

    @FindBy(how = How.ID,using ="psycInappropriateBehavior")
    public WebElement psycInappropriateBehavior;

    @FindBy(how = How.ID,using ="psycIrritablity")
    public WebElement psycIrritablity ;

    @FindBy(how = How.NAME,using ="psycComments")
    public WebElement psycComments;



    public void CaptureForm() throws InterruptedException {


     Check(psycWNL);
     Check(psycPoorHomeEnvironment);
     EnterText(psycPoorHomeEnvironment,"3");
     Check(psycPoorCopingSkills);
     Check(psycAgitated);
     Check(psycDepressedMood);
     Check(psycImpairedDecisionMaking);
     Check(psycDemonstratedExpressedAnxiety);
     Check(psycInappropriateBehavior);
     Check(psycIrritablity);



    }





}
