package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// demoqa.com
// Buttons test
public class Test5 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);     //Action sınıfı, belirli web öğelerinde bir klavyeden
        actions.doubleClick(doubleClickButton).perform();   // veya fareden giriş eylemlerini simüle etmek için kullanılır

        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        String msgText = message.getText();
        System.out.println(msgText);

        ///////////////////////

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton).perform();

        WebElement message2 = driver.findElement(By.id("rightClickMessage"));
        String msgText2 = message2.getText();
        System.out.println(msgText2);

        ////////////////////////

        WebElement dynamicClickButton = driver.findElement(By.xpath("//div/button[starts-with(text() , 'Click Me')]"));
        dynamicClickButton.click();

        WebElement message3 = driver.findElement(By.id("dynamicClickMessage"));
        String msgText3 = message3.getText();
        System.out.println(msgText3);


    }

}
