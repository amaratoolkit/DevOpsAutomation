package WebAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;

    @AfterSuite
    public void killSession(){
        driver.quit();
    }

    @BeforeSuite
    public void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeTest
    public void openApp(){
        driver.get("http://the-internet.herokuapp.com/");
       // driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
}
