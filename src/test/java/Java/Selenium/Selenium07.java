package Java.Selenium;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium07 {

        @Test
        @Description("Verify the current url, title of vwo app")

        public void testvwologin(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://app.vwo.com/#/login");
            System.out.println("Vwo login Page title- " +driver.getTitle());
            System.out.println("Vwo url Opened- " + driver.getCurrentUrl());
            Assert.assertEquals(driver.getTitle(),"Login - VWO");
            Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
            driver.quit();

        }




}
