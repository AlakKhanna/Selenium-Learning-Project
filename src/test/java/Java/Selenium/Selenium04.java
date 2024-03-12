package Java.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium04 {
    public static void main(String[] args) {

        EdgeOptions edgeOptions= new EdgeOptions();
//        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size 800,600");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }




}
