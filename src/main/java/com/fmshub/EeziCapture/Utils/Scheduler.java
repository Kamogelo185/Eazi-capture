package com.fmshub.EeziCapture.Utils;

import com.fmshub.EeziCapture.Capture;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {


    @Scheduled(cron = "0 0 1 * * *")
    public void Tasks(){
        Capture captureForm = new Capture();

        captureForm.ProcessForm("","","");
    }

}
