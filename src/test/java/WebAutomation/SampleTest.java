package WebAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SampleTest {
    public WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
    }

    @AfterTest
    public void closeSession(){
        driver.quit();
    }

    /**
     * Verify text entered in Text Editor
     *
     */
    @Test
    public void firstTest() {

        WebElement editor = driver.findElement(By.xpath("//*[text()='WYSIWYG Editor']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editor);
        editor.click();

        WebDriverWait wWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mce_0_ifr"));

        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Hello Motivity");

        driver.findElement(By.xpath("//p[text()='Hello Motivity']")).getText().equals("Hello Motivity");

    }
}
