package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// demoqa.com
// Tool Tips test
public class Test18 {

    WebDriver driver;

    @Test
    public void Test(){
        driver = new ChromeDriver();
        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        driver.get("https://demoqa.com/tool-tips");

        WebElement toolTipButton = driver.findElement(By.id("toolTipButton"));
        Actions actions = new Actions(driver);
        actions.moveToElement(toolTipButton).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));

        WebElement toolTip = driver.findElement(By.className("tooltip-inner"));
        System.out.println("Text: " + toolTip.getText());


    }
}
