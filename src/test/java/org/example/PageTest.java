package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.Time;
import java.util.concurrent.TimeUnit;


public abstract class PageTest {

    public WebDriver driver;

    @Before
    public void beforeCreateWebDriver(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        System.setProperty("webdriver.chrome.driver", "C:/Users/ege/Desktop/chromedriver.exe"); // chromedeiver yolu
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @After
    public void afterQuitWebDriver(){

        driver.quit();
    }
}
