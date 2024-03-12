package Java.Selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium05 {

    public static void main(String[] args) {
        ChromeOptions chromeoptions= new ChromeOptions();
        chromeoptions.addArguments("--incognito");
        chromeoptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        WebDriver driver = new ChromeDriver();
        driver.get("https://peter.sh/experiments/chromium-command-line-switches/");
        System.out.println("this is the title- " + driver.getTitle());
        driver.quit();

    }

}
