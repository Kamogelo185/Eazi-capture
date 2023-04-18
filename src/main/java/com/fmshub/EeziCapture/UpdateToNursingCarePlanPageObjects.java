package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class UpdateToNursingCarePlanPageObjects {

    final WebDriver driver;

    public UpdateToNursingCarePlanPageObjects(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.NAME,using="ncpProblem")
    public WebElement ncpProblem;

    @FindBy(how = How.NAME,using="ncpIntervention")
    public WebElement ncpIntervention;

    @FindBy(how = How.NAME,using="ncpGoal")
    public WebElement ncpGoal;


    public void CaptureForm() throws InterruptedException {

     EnterText(ncpProblem,"1");
     EnterText(ncpIntervention,"2");
     EnterText(ncpGoal,"1");



    }
}
