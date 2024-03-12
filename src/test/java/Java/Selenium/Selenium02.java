package Java.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    public void testMethod(){
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new EdgeDriver();
        WebDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new SafariDriver();

    }
}
