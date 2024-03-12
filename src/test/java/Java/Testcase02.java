package Java;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase02 {

    @Test
    @Description("verify the title of the google website")
    public void vwologin(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("This the google landing page title -  "+ driver.getTitle());
        driver.quit();

    }
}
