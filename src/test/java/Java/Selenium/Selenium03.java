package Java.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium03 {

    @Test
    public  void testmethod (){

        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addExtensions(new File("/Users/alak/Downloads/AdBlock-—-best-ad-blocker.crx"));
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();



    }
}
