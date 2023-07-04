package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// demoqa.com
// Alerts test
public class Test10 {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        System.setProperty("chromeDriver", "drivers/chromedriver.exe");

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement alertClick = driver.findElement(By.id("promtButton"));
        alertClick.click();

        try {
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("bedo");
        driver.switchTo().alert().accept();
    }
}
