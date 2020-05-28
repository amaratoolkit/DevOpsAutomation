package WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumWaits extends BaseTest{

    @Test
    public void testWait(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        //wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[text()='Checkboxes']"), true));
        WebElement checkboxes = driver.findElement(By.xpath("//*[text()='Checkboxes']"));
        wait.until(ExpectedConditions.visibilityOf(checkboxes)).click();

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxes.get(0))).click();

        Assert.assertTrue(checkBoxes.get(0).isSelected());
    }
}
