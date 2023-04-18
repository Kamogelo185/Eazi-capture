package com.fmshub.EeziCapture;

import com.fmshub.EeziCapture.Utils.Scheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {

	public static void main(String[] args) throws InterruptedException {
		Scheduler scheduler = new Scheduler();
		scheduler.Tasks();

		SpringApplication.run(Application.class, args);
	}

}
