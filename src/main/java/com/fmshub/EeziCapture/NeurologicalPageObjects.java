package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class NeurologicalPageObjects {

    final WebDriver driver;

    public NeurologicalPageObjects(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(how = How.ID,using = "")
    public WebElement oriented;

    @FindBy(how = How.ID,using ="neuroPerson")
    public WebElement neuroPerson;

    @FindBy(how = How.ID,using ="neuroPlace")
    public WebElement neuroPlace;

    @FindBy(how = How.ID,using ="neuroTime")
    public WebElement neuroTime;

    @FindBy(how = How.ID,using ="neuroDisoriented")
    public WebElement neuroDisoriented;

    @FindBy(how = How.ID,using ="neuroForgetful")
    public WebElement neuroForgetful;

    @FindBy(how = How.ID,using ="neuroLethargic")
    public WebElement neuroLethargic;

    @FindBy(how = How.ID,using ="neuroPERRL")
    public WebElement neuroPERRL;

    @FindBy(how = How.ID,using ="neuroSeizures")
    public WebElement neuroSeizures;

    @FindBy(how = How.ID,using = "")
    public WebElement tremors;

    @FindBy(how = How.NAME,using ="neuroTremorLocations")
    public WebElement neuroTremorLocations;


    public void CaptureForm() throws InterruptedException {

     Check(neuroPerson);
     Check(neuroPlace);
     Check(neuroTime);
     Check(neuroDisoriented);
     Check(neuroForgetful);
     Check(neuroLethargic);
     Check(neuroPERRL);
     Check(neuroSeizures);
     EnterText(neuroTremorLocations,"1");


    }








}









