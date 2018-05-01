package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstTest {
    @Test
    public void startwebDriver(){
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to("http://seleniumsimplified.com/");
        Assert.assertTrue("title should start with Selenium simplified",driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();

    }

}
