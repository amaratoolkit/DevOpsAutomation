package WebAutomation;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Validations extends BaseTest {

    @Test
    public void checkboxVerify() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Checkboxes']")).click();

        Thread.sleep(2000);
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));

        System.out.println("Checkbox status === " + checkBoxes.get(1).isSelected());
        Assert.assertTrue( checkBoxes.get(1).isSelected());
        Assert.assertFalse(checkBoxes.get(0).isSelected());

        checkBoxes.get(1).click();
        Assert.assertFalse(checkBoxes.get(1).isSelected());
    }
}
