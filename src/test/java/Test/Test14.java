package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

// demoqa.com
// Auto Complete test
public class Test14 {

    WebDriver driver;

    @Test
    public void Test(){

        driver = new ChromeDriver();
        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        driver.get("https://demoqa.com/auto-complete");

        WebElement input = driver.findElement(By.id("autoCompleteMultipleInput"));
        input.sendKeys("r");

        List<WebElement> list = driver.findElements(By.cssSelector("div.auto-complete__option"));
        for (WebElement lists : list){
            System.out.println(lists.getText());

            if (lists.getText().equalsIgnoreCase("red")){
                lists.click();
                break;
            }

            /*
            if (lists.getText().toLowerCase().contains("r")){
                System.out.println(lists.getText() + " has r letter.");
            }
            if (lists.getText().toLowerCase().contains("w")){
                System.out.println(lists.getText() + " has w letter.");
            }
            */
        }

        //list.get(0).click();


    }
}
