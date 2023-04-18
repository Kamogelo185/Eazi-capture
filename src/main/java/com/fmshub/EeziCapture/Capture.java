package com.fmshub.EeziCapture;


import org.openqa.selenium.support.PageFactory;
import static com.fmshub.EeziCapture.Utils.utilities.*;


public class Capture {
    public static void ProcessForm(String url,String username, String password){

        try {
            //Open Browser
            open_Browser();

            // Navigate to the Website
            launch_App(url);

            System.out.println(driver.getPageSource());

            //Initialize Page Object
            LoginPageObjects loginPg = PageFactory.initElements(driver, LoginPageObjects.class);

            //Perform Operation for the Page Object
            loginPg.CaptureForm();

            VitalSignsPageObjects vitalSignsPageObjects = PageFactory.initElements(driver,VitalSignsPageObjects.class);
            vitalSignsPageObjects.CaptureForm();

            CardiovascularPageObjects cardiovascularPageObjects = PageFactory.initElements(driver,CardiovascularPageObjects.class);
            cardiovascularPageObjects.CaptureForm();

            RespiratoryPageObjects respiratoryPageObjects = PageFactory.initElements(driver,RespiratoryPageObjects.class);
            respiratoryPageObjects.CaptureForm();

            NeurologicalPageObjects neurologicalPageObjects = PageFactory.initElements(driver,NeurologicalPageObjects.class);
            neurologicalPageObjects.CaptureForm();

            SensoryPageObjects sensoryPageObjects = PageFactory.initElements(driver,SensoryPageObjects.class);
            sensoryPageObjects.CaptureForm();

            VisionPageObjects visionPageObjects = PageFactory.initElements(driver,VisionPageObjects.class);
            visionPageObjects.CaptureForm();

            HomeboudPageObjects homeboudPageObjects = PageFactory.initElements(driver,HomeboudPageObjects.class);
            homeboudPageObjects.CaptureForm();

            GuPageObjects guPageObjects = PageFactory.initElements(driver,GuPageObjects.class);
            guPageObjects.CaptureForm();

            MusculoskeletalPageObjects musculoskeletalPageObjects = PageFactory.initElements(driver,MusculoskeletalPageObjects.class);
            musculoskeletalPageObjects.CaptureForm();

            PsycosocialPageObjects psycosocialPageObjects = PageFactory.initElements(driver,PsycosocialPageObjects.class);
            psycosocialPageObjects.CaptureForm();

            SkinPageObjects  skinPageObjects = PageFactory.initElements(driver,SkinPageObjects.class);
            skinPageObjects.CaptureForm();

            PainPageObjects painPageObjects = PageFactory.initElements(driver,PainPageObjects.class);
            painPageObjects.CaptureForm();

            DigestiveNutritionPageObjects digestiveNutritionPageObjects = PageFactory.initElements(driver,DigestiveNutritionPageObjects.class);
            digestiveNutritionPageObjects.CaptureForm();

            OstomyPageObjects ostomyPageObjects = PageFactory.initElements(driver,OstomyPageObjects.class);
            ostomyPageObjects.CaptureForm();

            TubeFeedingPageObjects tubeFeedingPageObjects = PageFactory.initElements(driver,TubeFeedingPageObjects.class);
            tubeFeedingPageObjects.CaptureForm();

            SkilledInterventionPageObjects skilledInterventionPageObjects = PageFactory.initElements(driver,SkilledInterventionPageObjects.class);
            skilledInterventionPageObjects.CaptureForm();

            CoordinationPlanPageObjects coordinationPlanPageObjects = PageFactory.initElements(driver,CoordinationPlanPageObjects.class);
            coordinationPlanPageObjects.CaptureForm();

            UpdateToNursingCarePlanPageObjects updateToNursingCarePlanPageObjects = PageFactory.initElements(driver,UpdateToNursingCarePlanPageObjects.class);
            updateToNursingCarePlanPageObjects.CaptureForm();







































            //Close the Browser
            closeBrowser();
        }
        catch (Exception e){
            driver.quit();
        }

    }
}
