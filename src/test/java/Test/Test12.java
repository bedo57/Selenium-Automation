package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// demoqa.com
// Modal test
public class Test12 {

    WebDriver driver;

    @Test
    public void Test(){
        driver = new ChromeDriver();
        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        driver.get("https://demoqa.com/modal-dialogs");

        WebElement smallButton = driver.findElement(By.id("showSmallModal"));
        smallButton.click();

        WebElement modalText = driver.findElement(By.cssSelector("div.modal-body"));
        System.out.println(modalText.getText());

        WebElement smallCloseButton = driver.findElement(By.id("closeSmallModal"));
        smallCloseButton.click();

    }
}
