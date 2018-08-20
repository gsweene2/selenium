package com.garrett.selenium;

import com.garrett.selenium.BookExample.BestPractises3;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SeleniumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeleniumApplication.class, args);
		System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");

        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        Result result = junit.run(BestPractises3.class);

        /*
        List<Failure> failures = result.getFailures();
        for (Failure fail:failures){
            System.out.println("-------------------");
            System.out.println(fail.getTestHeader());
            System.out.println(fail.getException());
            System.out.println(fail.getDescription());
        }
        if (failures.size() == 0){
            System.out.println("-------------------");
            System.out.println("All tests Succeeded!");
        }
        */
	}
}
