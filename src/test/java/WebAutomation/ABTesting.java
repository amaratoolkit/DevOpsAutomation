package WebAutomation;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ABTesting extends BaseTest {

    //@Test
    public void abTest(){
        WebElement abTest = driver.findElement(By.xpath("//a[@href='/abtest']"));
        abTest.click();

        WebElement heading = driver.findElement(By.cssSelector(".example h3"));
        // getText() === it retrieve text from Web page
        String headingActualText = heading.getText();
        System.out.println("Heading ----- " + headingActualText);
        // Assert.assertEquals(headingActualText, "A/B Test Control");

        WebElement subHeadingText = driver.findElement(By.cssSelector(".example"));


        //subHeadingText.getText().contains("38329432490239");
        Assert.assertTrue(subHeadingText.getText().contains("split testing"));

    }

   public List<String> getTextOfElement(){
       List<String> elementText = new ArrayList<String>();
        List<WebElement> deleteButton = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));

        int deleteButtonSize = deleteButton.size();


        for(int j=0; j<deleteButton.size(); j++){
            System.out.println("Text of Elements===="+ deleteButton.get(j).getText());
            elementText.add(deleteButton.get(j).getText());
        }
    return elementText;
    }

    @Test
    public void addRemoveElements(){
        WebElement addRemoveLink = driver.findElement(By.xpath("//*[contains(text(),'Add/Remove')]"));
        addRemoveLink.click();

        WebElement addElement = driver.findElement(By.xpath("//*[contains(text(),'Add Element')]"));

        Assert.assertTrue(addElement.isDisplayed());

        for(int i=0; i<5; i++){
            addElement.click();
        }

        List<WebElement> deleteButton = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));

        int deleteButtonSize = deleteButton.size();


        for(int j=0; j<deleteButton.size(); j++){
            System.out.println("Text of Elements===="+ deleteButton.get(j).getText());
        }
        System.out.println("List of elements" + getTextOfElement());
        Assert.assertEquals(deleteButtonSize, 5);

        System.out.println("deleteButtonSize ==="+ deleteButtonSize);



    }
}
