package Test;

import org.asynchttpclient.util.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// demoqa.com
// Slider test
public class Test16 {

    WebDriver driver;

    @Test
    public void Test(){
        driver = new ChromeDriver();
        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        driver.get("https://demoqa.com/slider");

        WebElement slinder = driver.findElement(By.cssSelector("input[type='range']"));

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slinder, 20,0).perform(); // noktayı hareket ettirdik

        WebElement slinderValue = driver.findElement(By.className("range-slider__tooltip__label"));
        String value = slinderValue.getText();
        System.out.println("Value = " + value);

        WebElement slinderValue2 = driver.findElement(By.id("sliderValue"));
        String value2 = slinderValue2.getAttribute("value");
        System.out.println("Value = " + value2);

        if (value.equals(value2)){
            System.out.println("Test passed");
        }else {
            System.out.println("Failed to test");
        }
    }
}
