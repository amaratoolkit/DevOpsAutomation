package WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownHandle extends BaseTest{

    @Test
    public void selectList(){
        WebElement dropdownLink = driver.findElement(By.cssSelector("a[href='/dropdown']"));
        dropdownLink.click();
        WebElement listOptions = driver.findElement(By.cssSelector("#dropdown"));

        Select selectOption = new Select(listOptions);

        System.out.println("Multiple Option ==== "+ selectOption.isMultiple());
        Assert.assertFalse(selectOption.isMultiple());


        System.out.println("Number of Selected Options ==== "+ selectOption.getAllSelectedOptions().size());

        System.out.println("Number of Options ==== "+ selectOption.getOptions().size());

        System.out.println("Number of Options ==== "+ selectOption.getFirstSelectedOption().getText());

        selectOption.selectByIndex(1);

        System.out.println("Number of Selected Options Text ==== "+ selectOption.getAllSelectedOptions().get(0).getText());

        selectOption.selectByVisibleText("Option 2");

        System.out.println("Number of Selected Options Text ==== "+ selectOption.getAllSelectedOptions().get(0).getText());



    }
}
