package Java.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium06 {

    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://peter.sh/experiments/chromium-command-line-switches/");
        driver.navigate().to(new URL("https://www.google.com/"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
