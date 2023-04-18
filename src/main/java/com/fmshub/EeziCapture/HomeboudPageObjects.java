package com.fmshub.EeziCapture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.fmshub.EeziCapture.Utils.utilities.*;
public class HomeboudPageObjects {

    final WebDriver driver;

    public HomeboudPageObjects(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.ID,using ="homeboundV2Yes")
    public WebElement homeboundV2Yes;

    @FindBy(how = How.ID,using ="homeboundV2No")
    public WebElement homeboundV2No;

    @FindBy(how = How.ID,using ="homeboundV2Criteria1A")
    public WebElement homeboundV2Criteria1A;

    @FindBy(how = How.ID,using ="homeboundV2Criteria1B")
    public WebElement homeboundV2Criteria1B;

    @FindBy(how = How.ID,using ="homeboundV2Criteria1BAdditionalInformation")
    public WebElement homeboundV2Criteria1BAdditionalInformation;

    @FindBy(how = How.ID,using  ="homeboundV2Criteria2A")
    public WebElement homeboundV2Criteria2A;

    @FindBy(how = How.ID,using ="homeboundV2Criteria2B")
    public WebElement homeboundV2Criteria2B;

    @FindBy(how = How.ID,using ="homeboundV2Criteria2BAdditionalInformation")
    public WebElement homeboundV2Criteria2BAdditionalInformation;


    public void CaptureForm() throws InterruptedException {

     Check(homeboundV2Yes);
     Check(homeboundV2No);
     Check(homeboundV2Criteria1A);
     Check(homeboundV2Criteria1B);
     Check(homeboundV2Criteria1BAdditionalInformation);
     Check(homeboundV2Criteria2A);
     Check(homeboundV2Criteria2B);
     Check(homeboundV2Criteria2BAdditionalInformation);



    }
}
