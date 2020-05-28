package WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Navigations extends BaseTest{

    @Test
    public void testNavigations() throws InterruptedException {
        WebElement abTest = driver.findElement(By.xpath("//a[@href='/abtest']"));
        abTest.click();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);


    }
}
