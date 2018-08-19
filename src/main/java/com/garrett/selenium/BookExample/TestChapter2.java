package com.garrett.selenium.BookExample;

import org.openqa.selenium.*;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestChapter2 {
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
    public void ShouldLoadTheHomePageAndThenCheckButtonOnChapter2() {
        selenium.get("http://book.theautomatedtester.co.uk");
        HomePage hp = new HomePage(selenium);
        Chapter2 ch2 = hp.clickChapter2();
        Assert.assertTrue(ch2.isButtonPresent("but1"));
    }

}
