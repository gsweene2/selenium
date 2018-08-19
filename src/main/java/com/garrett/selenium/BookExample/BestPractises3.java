package com.garrett.selenium.BookExample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestPractises3 {
    WebDriver selenium;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        selenium = new FirefoxDriver();
    }

    @After
    public void tearDown(){
        selenium.quit();
    }

    @Test
    public void ShouldLoadTheHomePageAndThenCheckButtonOnChapter2(){
        selenium.get("http://book.theautomatedtester.co.uk");
        HomePage hp = new HomePage(selenium);
        Chapter2 ch2 = hp.clickChapter2();
        Assert.assertTrue(ch2.isButtonPresent("but1"));
    }
}
