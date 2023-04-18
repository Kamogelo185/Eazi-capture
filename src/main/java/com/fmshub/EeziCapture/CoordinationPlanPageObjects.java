package com.fmshub.EeziCapture;

import org.apache.poi.hssf.util.HSSFColor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class CoordinationPlanPageObjects {


    final WebDriver driver;

    public CoordinationPlanPageObjects(WebDriver driver){
        this.driver=driver;
    }


    @FindBy(how = How.ID,using="coordinationPlanProgress")
    public WebElement coordinationPlanProgress;

    @FindBy(how = How.ID,using="coordinationPlanConferencedWith")
    public WebElement coordinationPlanConferencedWith;

    @FindBy(how = How.NAME,using="coordinationPlanConferencedWithName")
    public WebElement coordinationPlanConferencedWithName;

    @FindBy(how = How.NAME,using="coordinationPlanRegarding")
    public WebElement coordinationPlanRegarding;

    @FindBy(how = How.NAME,using="coordinationPlanPhysicianContacted")
    public WebElement coordinationPlanPhysicianContacted;

    @FindBy(how = How.NAME,using="coordinationPlanOrderChanges")
    public WebElement coordinationPlanOrderChanges;

    @FindBy(how = How.NAME,using="coordinationPlanNextVisit")
    public WebElement coordinationPlanNextVisit;

    @FindBy(how = How.NAME,using="coordinationPlanPhyscicianVisit")
    public WebElement coordinationPlanPhyscicianVisit;

    @FindBy(how = How.NAME,using="coordinationPlanDischargePlanning")
    public WebElement coordinationPlanDischargePlanning;

    @FindBy(how = How.ID,using="coordinationPlanDischargePlanningNotice")
    public WebElement coordinationPlanDischargePlanningNotice;

    @FindBy(how = How.ID,using="coordinationPlanDischargeDate")
    public WebElement coordinationPlanDischargeDate;


    public void CaptureForm() throws InterruptedException {


     EnterText(coordinationPlanProgress,"80");
     Select(coordinationPlanConferencedWith,"Value","MSW");
     EnterText(coordinationPlanConferencedWithName,"2");
     EnterText(coordinationPlanRegarding,"4");
     EnterText(coordinationPlanPhysicianContacted,"40");
     EnterText(coordinationPlanOrderChanges,"30");
     EnterText(coordinationPlanNextVisit,"17");
     EnterText(coordinationPlanPhyscicianVisit,"35");
     EnterText(coordinationPlanDischargePlanning,"10");
     Check(coordinationPlanDischargePlanningNotice);
     EnterText(coordinationPlanDischargeDate,"12");







    }

}
